public class AlphabetStarPattern {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch + ":");
            printPattern(ch);
            System.out.println();
        }
    }

    public static void printPattern(char ch) {
        int i, j;
        switch (ch) {
            case 'A':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 7; j++) {
                        if ((j == 3 && i == 0) || 
                            (j == 2 && i == 1) || (j == 4 && i == 1) || 
                            (j == 1 && i == 2) || (j == 5 && i == 2) ||
                            (i == 3 && j > 0 && j < 6) ||
                            (j == 1 && i > 3) || (j == 5 && i > 3))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'B':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 6; j++) {
                        if (j == 0 || 
                            (i == 0 && j < 5) || (i == 3 && j < 5) || (i == 6 && j < 5) || 
                            (j == 5 && i != 0 && i != 3 && i != 6))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'C':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 6; j++) {
                        if ((i == 0 && j > 0) || (i == 6 && j > 0) || j == 0)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'D':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 6; j++) {
                        if (j == 0 || 
                            (i == 0 && j < 5) || (i == 6 && j < 5) || 
                            (j == 5 && i > 0 && i < 6))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'E':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 6; j++) {
                        if (j == 0 || i == 0 || i == 3 || i == 6)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'F':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 6; j++) {
                        if (j == 0 || i == 0 || i == 3)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'G':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 6; j++) {
                        if ((i == 0 && j > 0) || (i == 6 && j > 0) || j == 0 ||
                            (i == 3 && j >= 3) || (j == 5 && i >= 3 && i < 6))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'H':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 6; j++) {
                        if (j == 0 || j == 5 || i == 3)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'I':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 5; j++) {
                        if (i == 0 || i == 6 || j == 2)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'J':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 5; j++) {
                        if (i == 0 || j == 2 || (i == 6 && j < 2) || (j == 0 && i > 3))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'K':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 6; j++) {
                        if (j == 0 || j == 5 - i || j == i - 1)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'L':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 6; j++) {
                        if (j == 0 || i == 6)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'M':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 7; j++) {
                        if (j == 0 || j == 6 || (i == j && i <= 3) || (i + j == 6 && i <= 3))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'N':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 7; j++) {
                        if (j == 0 || j == 6 || i == j)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'O':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 7; j++) {
                        if ((i == 0 && j > 0 && j < 6) || 
                            (i == 6 && j > 0 && j < 6) ||
                            (j == 0 && i > 0 && i < 6) ||
                            (j == 6 && i > 0 && i < 6))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'P':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 6; j++) {
                        if (j == 0 || (i == 0 && j < 5) || 
                            (i == 3 && j < 5) || (j == 5 && i > 0 && i < 3))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'Q':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 7; j++) {
                        if ((i == 0 && j > 0 && j < 6) || 
                            (i == 5 && j > 0 && j < 6) ||
                            (j == 0 && i > 0 && i < 5) ||
                            (j == 6 && i > 0 && i < 5) ||
                            (i == j && i >= 3))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'R':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 6; j++) {
                        if (j == 0 || (i == 0 && j < 5) || 
                            (i == 3 && j < 5) || (j == 5 && i > 0 && i < 3) ||
                            (i - j == 3))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'S':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 6; j++) {
                        if ((i == 0 && j > 0) || (i == 3 && j > 0 && j < 5) || 
                            (i == 6 && j < 5) || (j == 0 && i < 3 && i > 0) || 
                            (j == 5 && i > 3 && i < 6))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'T':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 7; j++) {
                        if (i == 0 || j == 3)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'U':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 6; j++) {
                        if ((j == 0 && i < 6) || (j == 5 && i < 6) || (i == 6 && j > 0 && j < 5))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'V':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 7; j++) {
                        if ((j == i && i <= 3) || (i + j == 6 && i <= 3) || 
                            (i >= 4 && ((i == 4 && j == 2) || (i == 5 && j == 3) || (i == 6 && j == 3))))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'W':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 7; j++) {
                        if (j == 0 || j == 6 || (i >= 3 && (i == j || i + j == 6)))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'X':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 7; j++) {
                        if (i == j || i + j == 6)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'Y':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 7; j++) {
                        if ((i == j && i < 3) || (i + j == 6 && i < 3) || (j == 3 && i >= 3))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 'Z':
                for (i = 0; i < 7; i++) {
                    for (j = 0; j < 7; j++) {
                        if (i == 0 || i == 6 || i + j == 6)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Pattern not defined for " + ch);
        }
    }
}
