package Prüfungsvorbereitung.Übungsaufgaben.Prüf.Website;

public class WebsiteChangeWatcher {
    private String target;
    private String path;

    public WebsiteChangeWatcher(String target, String path) {
        this.target = target;
        this.path = path;
    }

    public void hasChanged() {
        Thread thread = new Thread(() -> {
            String oldContent = retrieveWebsiteContent(target, path);
            try {
                Thread.sleep(30000); // 30 Sekunden warten
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String newContent = retrieveWebsiteContent(target, path);
            if (!oldContent.equals(newContent)) {
                System.out.println("Website content has changed.");
            } else {
                System.out.println("No change detected.");
            }
        });
        thread.start();
    }

    private String retrieveWebsiteContent(String target, String path) {
        // Diese Methode wird laut Aufgabenstellung als gegeben betrachtet.
        // Sie lädt den Inhalt der Seite von (target + "/" + path)
        // (Hier ist nur ein Platzhalter – muss nicht implementiert werden.)
        return "";
    }

    public void cancel() {
        // Wird später implementiert
    }

}
