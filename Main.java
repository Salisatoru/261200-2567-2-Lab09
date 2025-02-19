package main;


import dip.DipMain;
import lsp.LspMain;
import ocp.OcpMain;

public class Main {
    public static void main(String[] args) {
        System.out.println("Running OCP Example:");
        OcpMain.main(args);

        System.out.println("\nRunning LSP Example:");
        LspMain.main(args);

        System.out.println("\nRunning DIP Example:");
        DipMain.main(args);
    }
}

