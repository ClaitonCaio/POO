import javax.swing.*;
import java.awt.*;

public class Cruzamento extends JPanel {
    private Semaforo semaforoHorizontal;
    private Semaforo semaforoVertical;
    private boolean modoDigital;
    private Timer timer;
    private boolean running;

    public Cruzamento() {
        this.semaforoHorizontal = new Semaforo();
        this.semaforoVertical = new Semaforo();
        this.modoDigital = true;
        this.running = false;
    }

    private void iniciarTimer() {
        timer = new Timer(1000, e -> {
            AbreFecha();
            repaint();
        });
        timer.start();
    }

    private void AbreFecha() {
        if (semaforoHorizontal.getTempoRestante() > 0) {
            semaforoHorizontal.setTempoRestante(semaforoHorizontal.getTempoRestante() - 1);
        }
        if (semaforoVertical.getTempoRestante() > 0) {
            semaforoVertical.setTempoRestante(semaforoVertical.getTempoRestante() - 1);
        }
    }

    public void Tempo() throws InterruptedException {
        running = true;
        while (running) {

            semaforoHorizontal.TrocaVerde(10);
            semaforoVertical.TrocaVermelho(12);
            Thread.sleep(10000); // 10 segundos

            semaforoHorizontal.TrocaAmarelo(1);
            Thread.sleep(1000); // 1 segundo

            semaforoHorizontal.TrocaVermelho(12);
            semaforoVertical.TrocaVerde(10);
            Thread.sleep(10000); // 10 segundos

            semaforoVertical.TrocaAmarelo(1);
            Thread.sleep(1000); // 1 segundos
        }
    }

    public void TrocarSemaforo() {
        modoDigital = !modoDigital;
        repaint();
    }

    public void iniciarSemaforo() {
        if (timer == null || !timer.isRunning()) {
            iniciarTimer();
        }
        new Thread(() -> {
            try {
                Tempo();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public void paraSemaforo() {
        running = false;
        if (timer != null) {
            timer.stop();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (modoDigital) {
            drawSemaforoDigital(g, semaforoHorizontal, 300, 150); // Semáforo horizontal
            drawSemaforoDigital(g, semaforoVertical, 400, 150);   // Semáforo vertical
        } else {
            drawSemaforoAnalogico(g, semaforoHorizontal, 350, 150); // Semáforo horizontal
            drawSemaforoAnalogico(g, semaforoVertical, 400, 150);   // Semáforo vertical
        }
    }

    private void drawSemaforoAnalogico(Graphics g, Semaforo semaforo, int x, int y) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.BLACK);
        g2d.fillRoundRect(x, y, 30, 90, 10, 10);

        g2d.setColor(semaforo.getCor() == Color.RED ? Color.RED : Color.DARK_GRAY);
        g2d.fillOval(x + 5, y + 5, 20, 20);
        g2d.setColor(semaforo.getCor() == Color.YELLOW ? Color.YELLOW : Color.DARK_GRAY);
        g2d.fillOval(x + 5, y + 35, 20, 20);
        g2d.setColor(semaforo.getCor() == Color.GREEN ? Color.GREEN : Color.DARK_GRAY);
        g2d.fillOval(x + 5, y + 65, 20, 20);
    }

    private void drawSemaforoDigital(Graphics g, Semaforo semaforo, int x, int y) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.BLACK);
        g2d.fillRoundRect(x, y, 70, 90, 10, 10);

        g2d.setColor(semaforo.getCor());
        g2d.fillOval(x + 15, y + 30, 20, 20); // Indicação da cor do semáforo

        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Arial", Font.BOLD, 20));
        String tempoRestante = String.valueOf(semaforo.getTempoRestante());
        g2d.drawString(tempoRestante, x + 50 - g2d.getFontMetrics().stringWidth(tempoRestante) / 2, y + 48); // Exibe o tempo restante
    }
}
