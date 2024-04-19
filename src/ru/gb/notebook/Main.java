package ru.gb.notebook;

public class Main {
        public static void main(String[] args) {
                NotebookSet notebooks = new NotebookSet();

                Notebook notebook1 = new Notebook("Acer", 16, 512, "Windows", "grey");
                Notebook notebook2 = new Notebook("Acer", 8, 512, "Windows", "black");
                Notebook notebook3 = new Notebook("Lenovo", 16, 512, "Windows", "black");
                Notebook notebook4 = new Notebook("Lenovo", 8, 512, "Windows", "grey");
                Notebook notebook5 = new Notebook("Asus", 16, 1000, "Windows", "black");
                Notebook notebook6 = new Notebook("Asus", 32, 512, "Windows", "black");
                Notebook notebook7 = new Notebook("Apple", 8, 256, "macOS", "grey");
                Notebook notebook8 = new Notebook("Apple", 8, 512, "macOS", "black");
                Notebook notebook9 = new Notebook("Apple", 16, 512, "macOS", "grey");
                Notebook notebook10 = new Notebook("Honor", 16, 512, "Windows", "white");

                notebooks.addNotebook(notebook1);
                notebooks.addNotebook(notebook2);
                notebooks.addNotebook(notebook3);
                notebooks.addNotebook(notebook4);
                notebooks.addNotebook(notebook5);
                notebooks.addNotebook(notebook6);
                notebooks.addNotebook(notebook7);
                notebooks.addNotebook(notebook8);
                notebooks.addNotebook(notebook9);
                notebooks.addNotebook(notebook10);


                for (Notebook notebook : notebooks.filterList()) {
                        System.out.println(notebook);
                }
        }
}


//----------------------------------------------------------------