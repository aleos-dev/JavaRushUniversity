package ua.javarush.task.jdk13.task27.task2707;

public class MailServer implements Runnable {
    private Mail mail;

    public MailServer(Mail mail) {
        this.mail = mail;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        // напишіть тут ваш код
        synchronized (mail) {
            try {

                while (mail.getText() == null) {
                    mail.wait();
                }

                String name = Thread.currentThread().getName();
                long endTime = System.currentTimeMillis();
                System.out.format("%s MailServer received: [%s] in %d ms after start", name, mail.getText(), (endTime - startTime));

                mail.setText(null);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
