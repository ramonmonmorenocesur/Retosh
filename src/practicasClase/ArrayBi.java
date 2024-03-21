package practicasClase;

public class ArrayBi {
    public static void main(String[] args) {

        // construir un array de de 10 arrays de 3 Strings
        String[] arrayStrings = new String[3]; // array de 3 Strings.

        String[][] arrayDeIdiomas = new String[5][3]; // declaracion
        String[] espanol = { "perro", "gato", "casa", "coche", "arbol" };
        String[] ingles = { "dog", "cat", "house", "car", "tree" };
        String[] rumano = { "caine", "psisina", "casa", "masina", "pom" };

        // cada array de String va a ser un
        // lenguaje.(columna).ingles(0),español(1),frances(2)

        // cada array va a ser un conjunto de palabras
        // la composicion va a ser la palabara traducida a su idioma
        // palabras
        // perro,gato,casa,coche,arbol.
        // dog ,cat,house,car,tree
        // caine,pisica,casa,masina,pom

        for (int i = 0; i < arrayDeIdiomas.length; i++) { // 0 a 4
            for (int j = 0; j < arrayDeIdiomas[i].length; j++) {// 0a2

                if (j == 0) {
                    arrayDeIdiomas[i][j] = ingles[i];
                } else if (j == 1) {
                    arrayDeIdiomas[i][j] = espanol[i];
                } else {
                    arrayDeIdiomas[i][j] = rumano[i];

                }

            }

        }
        for (int i = 0; i < arrayDeIdiomas.length; i++) {
            System.out.println();
            for (int j = 0; j < arrayDeIdiomas[i].length; j++) {
                System.out.print(arrayDeIdiomas[i][j]+" ");
            }
        }

    }

}
