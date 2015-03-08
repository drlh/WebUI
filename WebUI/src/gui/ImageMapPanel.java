package gui;

import java.awt.*;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;
import javax.swing.*;
import obj.*;

/**
 *
 * @author Angst Fabian
 */
public class ImageMapPanel extends JPanel implements ActionListener,
        MouseListener, MouseMotionListener {

    public final static int ARROW_TOOL = 0;
    public final static int SQUARE_TOOL = 1;
    public final static int CIRCLE_TOOL = 2;
    public final static int TRIANGLE_TOOL = 3;
    public final static int DRAG_TOOL = 4;
    public final static int PENTAGON_TOOL = 5;
    public final static int HEXAGON_TOOL = 6;
    private int tool = ARROW_TOOL;
    private Color col = Color.WHITE;

    private GraphicalObject[] objects = new GraphicalObject[300];
    private String saveTo;
    private String source;

    private Point startPoint = null;
    private Point currentPoint = null;
    private Rectangle currentRect = null;
    private GraphicalObject currentShape = null;
    private BasicStroke stroke = new BasicStroke(1.0f, BasicStroke.CAP_BUTT,
            BasicStroke.JOIN_MITER, 1.0f, new float[]{1.0f, 1.0f}, 0.0f);
    private Vector<GraphicalObject> vec = new Vector<GraphicalObject>();
    private JPopupMenu popup = new JPopupMenu();
    private JMenuItem moveTop = new JMenuItem("Nach vorne");
    private JMenuItem moveBack = new JMenuItem("Nach hinten");
    private JMenuItem delete = new JMenuItem("Löschen");
    private JMenuItem info = new JMenuItem("Eigenschaften");
    private JMenuItem setLink = new JMenuItem("Link hinterlegen");
    private JMenuItem altLitel = new JMenuItem("alt-Tag setzen");

    private MainFrame win = null;

    public ImageMapPanel(MainFrame win) {
        this.win = win;
        setLayout(null);
        addMouseListener(this);
        addMouseMotionListener(this);

        popup.add(moveTop);
        popup.add(moveBack);
        popup.addSeparator();
        popup.add(delete);
        popup.addSeparator();
        popup.add(info);

        moveTop.addActionListener(this);
        moveBack.addActionListener(this);
        delete.addActionListener(this);
        info.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int button = e.getButton();
        startPoint = e.getPoint();

        if (tool == ARROW_TOOL) {
            if (button == MouseEvent.BUTTON1) {
                for (int i = vec.size() - 1; i >= 0; i--) {
                    GraphicalObject s = vec.get(i);
                    Rectangle r = s.getR();
                    if (s.contains(startPoint)) {
                        System.out.println(r);
                        currentShape = s;
                        currentRect = r;
                        break;
                    }
                }
            }
            if (button == MouseEvent.BUTTON3) {
                for (int i = vec.size() - 1; i >= 0; i--) {
                    GraphicalObject s = vec.get(i);
                    Rectangle r = s.getR();
                    if (s.contains(startPoint)) {
                        System.out.println(r);
                        currentShape = s;
                        currentRect = r;
                        popup.show(this, e.getX(), e.getY());
                        break;
                    }
                }

            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Rectangle r = calcRect();
        GraphicalObject s = null;

        switch (tool) {
            case SQUARE_TOOL:
                s = new RectangleObject(col, r.x, r.y, r.width, r.height);
                break;
            case CIRCLE_TOOL:
                s = new CircleObject(col, r.x, r.y, r.width, r.height);
                break;
            case TRIANGLE_TOOL:
                s = new TriangleObject(col, r.x, r.y, r.width, r.height);
                break;
            case PENTAGON_TOOL:
                s = new PentagonObject(col, r.x, r.y, r.width, r.height);
                break;
            case HEXAGON_TOOL:
                s = new HexagonObject(col, r.x, r.y, r.width, r.height);
                break;
        }

        if (s != null) {
            vec.add(s);
            repaint();
        }

        if (tool == ARROW_TOOL && currentPoint != null && currentRect != null) {
            int offX = currentPoint.x - startPoint.x;
            int offY = currentPoint.y - startPoint.y;
            r = (Rectangle) currentRect.clone();
            r.translate(offX, offY);
            currentShape.setR(r);
            repaint();
        }
        startPoint = null;
        currentPoint = null;
        currentRect = null;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D gr = (Graphics2D) g;
        for (int i = 0; i < vec.size(); i++) {
            GraphicalObject s = vec.get(i);
            s.draw(gr);
        }

        if ((tool == SQUARE_TOOL || tool == CIRCLE_TOOL || tool == TRIANGLE_TOOL || tool == HEXAGON_TOOL || tool == PENTAGON_TOOL)
                && startPoint != null && currentPoint != null) {
            Rectangle r = calcRect();
            gr.setStroke(stroke);
            gr.drawRect(r.x, r.y, r.width, r.height);
        }

    }

    private Rectangle calcRect() {
        Rectangle r = new Rectangle();

        if (currentPoint != null && startPoint != null) {
            int width = currentPoint.x - startPoint.x;
            int height = currentPoint.y - startPoint.y;

            r = new Rectangle(startPoint.x, startPoint.y, width, height);
            r = normalizeRect(r);
        }
        return r;
    }

    private static Rectangle normalizeRect(Rectangle r) {
        if (r != null) {
            if (r.width < 0) {
                r.width = -r.width;
                r.x -= r.width;
            }
            if (r.height < 0) {
                r.height = -r.height;
                r.y -= r.height;
            }
        }
        return r;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        currentPoint = e.getPoint();

        if (tool == ARROW_TOOL && currentRect != null) {
            int offX = currentPoint.x - startPoint.x;
            int offY = currentPoint.y - startPoint.y;
            Rectangle r = (Rectangle) currentRect.clone();
            r.translate(offX, offY);
            currentShape.setR(r);
        }
        repaint();

    }

    //getters & setters
    public Color getColor() {
        return col;
    }

    public void setColor(Color col) {
        this.col = col;
    }

}
