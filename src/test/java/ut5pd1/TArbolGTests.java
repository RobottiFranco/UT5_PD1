package ut5pd1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.swing.text.html.parser.Element;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;

public class TArbolGTests {
    @Nested
    class insertarTests {
        TNodoAG<Integer> nodo;
        TArbolG<Integer> arbol = new TArbolG<Integer>();

        @BeforeEach
        void SetUp() {
            nodo = new TNodoAG<Integer>(1, 1);
            arbol.setRaiz(nodo);

        }

        @Test
        void testInsercionInvalida() {
            arbol.insertar(2, 3);
            assertEquals(null, arbol.getRaiz().getHijoIzquierdo());
            assertEquals(null, arbol.getRaiz().getHermanoDerecho());
        }

        @Test
        void testInsercionValida() {
            arbol.insertar(2, 1);
            assertEquals(2, arbol.getRaiz().getHijoIzquierdo().getEtiqueta());
        }

        @Test
        void testInsercionValidaArbolConocido() {
            TNodoAG<Integer> nodo2 = new TNodoAG<Integer>(2, 2);
            TNodoAG<Integer> nodo3 = new TNodoAG<Integer>(3, 3);
            TNodoAG<Integer> nodo4 = new TNodoAG<Integer>(4, 4);
            TNodoAG<Integer> nodo5 = new TNodoAG<Integer>(5, 5);
            TNodoAG<Integer> nodo6 = new TNodoAG<Integer>(6, 6);
            TNodoAG<Integer> nodo7 = new TNodoAG<Integer>(7, 7);
            TNodoAG<Integer> nodo8 = new TNodoAG<Integer>(8, 8);
            TNodoAG<Integer> nodo9 = new TNodoAG<Integer>(9, 9);
            TNodoAG<Integer> nodo10 = new TNodoAG<Integer>(10, 10);
            TNodoAG<Integer> nodo11 = new TNodoAG<Integer>(11, 11);
            TNodoAG<Integer> nodo12 = new TNodoAG<Integer>(12, 12);
            arbol.getRaiz().setHijoIzquierdo(nodo2);
            nodo2.setHermanoDerecho(nodo3);
            nodo3.setHermanoDerecho(nodo4);
            nodo2.setHijoIzquierdo(nodo5);
            nodo5.setHermanoDerecho(nodo6);
            nodo6.setHermanoDerecho(nodo7);
            nodo4.setHijoIzquierdo(nodo8);
            nodo8.setHermanoDerecho(nodo9);
            nodo9.setHermanoDerecho(nodo10);
            nodo9.setHijoIzquierdo(nodo11);
            nodo11.setHijoIzquierdo(nodo12);
            arbol.insertar(13, 12);
            arbol.insertar(14, 6);
            arbol.insertar(15, 2);
            assertEquals(13, nodo12.getHijoIzquierdo().getEtiqueta());
            assertEquals(14, nodo6.getHijoIzquierdo().getEtiqueta());
            assertEquals(15, nodo7.getHermanoDerecho().getEtiqueta());
        }

        @Test
        void testInsercionInvalidaArbolConocido() {
            TNodoAG<Integer> nodo2 = new TNodoAG<Integer>(2, 2);
            TNodoAG<Integer> nodo3 = new TNodoAG<Integer>(3, 3);
            TNodoAG<Integer> nodo4 = new TNodoAG<Integer>(4, 4);
            TNodoAG<Integer> nodo5 = new TNodoAG<Integer>(5, 5);
            TNodoAG<Integer> nodo6 = new TNodoAG<Integer>(6, 6);
            TNodoAG<Integer> nodo7 = new TNodoAG<Integer>(7, 7);
            TNodoAG<Integer> nodo8 = new TNodoAG<Integer>(8, 8);
            TNodoAG<Integer> nodo9 = new TNodoAG<Integer>(9, 9);
            TNodoAG<Integer> nodo10 = new TNodoAG<Integer>(10, 10);
            TNodoAG<Integer> nodo11 = new TNodoAG<Integer>(11, 11);
            TNodoAG<Integer> nodo12 = new TNodoAG<Integer>(12, 12);
            arbol.getRaiz().setHijoIzquierdo(nodo2);
            nodo2.setHermanoDerecho(nodo3);
            nodo3.setHermanoDerecho(nodo4);
            nodo2.setHijoIzquierdo(nodo5);
            nodo5.setHermanoDerecho(nodo6);
            nodo6.setHermanoDerecho(nodo7);
            nodo4.setHijoIzquierdo(nodo8);
            nodo8.setHermanoDerecho(nodo9);
            nodo9.setHermanoDerecho(nodo10);
            nodo9.setHijoIzquierdo(nodo11);
            nodo11.setHijoIzquierdo(nodo12);
            assertEquals(false, arbol.insertar(13, 13));
            assertEquals(false, arbol.insertar(14, 14));
        }

        @Test
        void testInsercionInvalidaArbolVacio() {
            arbol = new TArbolG<Integer>();
            assertEquals(false, arbol.insertar(1, 1));
        }

        @Test
        void testInsercionValidaArbolVacio() {
            arbol = new TArbolG<Integer>();
            assertEquals(true, arbol.insertar(1, ""));
            assertEquals(1, arbol.getRaiz().getEtiqueta());
        }

        @Test
        void testInsercionNuevaRaiz() {
            TNodoAG<Integer> nodo2 = new TNodoAG<Integer>(2, 2);
            TNodoAG<Integer> nodo3 = new TNodoAG<Integer>(3, 3);
            TNodoAG<Integer> nodo4 = new TNodoAG<Integer>(4, 4);
            TNodoAG<Integer> nodo5 = new TNodoAG<Integer>(5, 5);
            TNodoAG<Integer> nodo6 = new TNodoAG<Integer>(6, 6);
            TNodoAG<Integer> nodo7 = new TNodoAG<Integer>(7, 7);
            TNodoAG<Integer> nodo8 = new TNodoAG<Integer>(8, 8);
            TNodoAG<Integer> nodo9 = new TNodoAG<Integer>(9, 9);
            TNodoAG<Integer> nodo10 = new TNodoAG<Integer>(10, 10);
            TNodoAG<Integer> nodo11 = new TNodoAG<Integer>(11, 11);
            TNodoAG<Integer> nodo12 = new TNodoAG<Integer>(12, 12);
            arbol.getRaiz().setHijoIzquierdo(nodo2);
            nodo2.setHermanoDerecho(nodo3);
            nodo3.setHermanoDerecho(nodo4);
            nodo2.setHijoIzquierdo(nodo5);
            nodo5.setHermanoDerecho(nodo6);
            nodo6.setHermanoDerecho(nodo7);
            nodo4.setHijoIzquierdo(nodo8);
            nodo8.setHermanoDerecho(nodo9);
            nodo9.setHermanoDerecho(nodo10);
            nodo9.setHijoIzquierdo(nodo11);
            nodo11.setHijoIzquierdo(nodo12);
            assertEquals(true, arbol.insertar(13, ""));
            assertEquals(13, arbol.getRaiz().getEtiqueta());
            assertEquals(null, arbol.getRaiz().getHijoIzquierdo());
            assertEquals(null, arbol.getRaiz().getHermanoDerecho());
        }
    }

    @Nested
    class buscarTests {
        TNodoAG<Integer> nodo;
        TArbolG<Integer> arbol = new TArbolG<Integer>();

        @BeforeEach
        void SetUp() {
            nodo = new TNodoAG<Integer>(1, 1);
            arbol.setRaiz(nodo);

        }

        @Test
        void testBusquedaExitosaArbolConocido() {
            TNodoAG<Integer> nodo2 = new TNodoAG<Integer>(2, 2);
            TNodoAG<Integer> nodo3 = new TNodoAG<Integer>(3, 3);
            TNodoAG<Integer> nodo4 = new TNodoAG<Integer>(4, 4);
            TNodoAG<Integer> nodo5 = new TNodoAG<Integer>(5, 5);
            TNodoAG<Integer> nodo6 = new TNodoAG<Integer>(6, 6);
            TNodoAG<Integer> nodo7 = new TNodoAG<Integer>(7, 7);
            TNodoAG<Integer> nodo8 = new TNodoAG<Integer>(8, 8);
            TNodoAG<Integer> nodo9 = new TNodoAG<Integer>(9, 9);
            TNodoAG<Integer> nodo10 = new TNodoAG<Integer>(10, 10);
            TNodoAG<Integer> nodo11 = new TNodoAG<Integer>(11, 11);
            TNodoAG<Integer> nodo12 = new TNodoAG<Integer>(12, 12);
            arbol.getRaiz().setHijoIzquierdo(nodo2);
            nodo2.setHermanoDerecho(nodo3);
            nodo3.setHermanoDerecho(nodo4);
            nodo2.setHijoIzquierdo(nodo5);
            nodo5.setHermanoDerecho(nodo6);
            nodo6.setHermanoDerecho(nodo7);
            nodo4.setHijoIzquierdo(nodo8);
            nodo8.setHermanoDerecho(nodo9);
            nodo9.setHermanoDerecho(nodo10);
            nodo9.setHijoIzquierdo(nodo11);
            nodo11.setHijoIzquierdo(nodo12);
            for (int i = 1; i < 13; i++) {
                assertEquals(true, nodo.buscar(i));
            }
        }

        @Test
        void testBusquedaNoExitosaArbolConocido() {
            TNodoAG<Integer> nodo2 = new TNodoAG<Integer>(2, 2);
            TNodoAG<Integer> nodo3 = new TNodoAG<Integer>(3, 3);
            TNodoAG<Integer> nodo4 = new TNodoAG<Integer>(4, 4);
            TNodoAG<Integer> nodo5 = new TNodoAG<Integer>(5, 5);
            TNodoAG<Integer> nodo6 = new TNodoAG<Integer>(6, 6);
            TNodoAG<Integer> nodo7 = new TNodoAG<Integer>(7, 7);
            TNodoAG<Integer> nodo8 = new TNodoAG<Integer>(8, 8);
            TNodoAG<Integer> nodo9 = new TNodoAG<Integer>(9, 9);
            TNodoAG<Integer> nodo10 = new TNodoAG<Integer>(10, 10);
            TNodoAG<Integer> nodo11 = new TNodoAG<Integer>(11, 11);
            TNodoAG<Integer> nodo12 = new TNodoAG<Integer>(12, 12);
            arbol.getRaiz().setHijoIzquierdo(nodo2);
            nodo2.setHermanoDerecho(nodo3);
            nodo3.setHermanoDerecho(nodo4);
            nodo2.setHijoIzquierdo(nodo5);
            nodo5.setHermanoDerecho(nodo6);
            nodo6.setHermanoDerecho(nodo7);
            nodo4.setHijoIzquierdo(nodo8);
            nodo8.setHermanoDerecho(nodo9);
            nodo9.setHermanoDerecho(nodo10);
            nodo9.setHijoIzquierdo(nodo11);
            nodo11.setHijoIzquierdo(nodo12);
            for (int i = -5; i < 1; i++) {
                assertEquals(false, nodo.buscar(i));
            }
            for (int i = 13; i < 20; i++) {
                assertEquals(false, nodo.buscar(i));
            }
        }
    }

    @Nested
    class listarTests {
        TNodoAG<Integer> nodo;
        TArbolG<Integer> arbol = new TArbolG<Integer>();

        @BeforeEach
        void SetUp() {
            nodo = new TNodoAG<Integer>(1, 1);
            arbol.setRaiz(nodo);

        }

        @Test
        void testListadoArbol2Niveles() {
            TNodoAG<Integer> nodo2 = new TNodoAG<Integer>(2, 2);
            TNodoAG<Integer> nodo3 = new TNodoAG<Integer>(3, 3);
            TNodoAG<Integer> nodo4 = new TNodoAG<Integer>(4, 4);
            TNodoAG<Integer> nodo5 = new TNodoAG<Integer>(5, 5);
            nodo.setHijoIzquierdo(nodo2);
            nodo2.setHermanoDerecho(nodo3);
            nodo3.setHermanoDerecho(nodo4);
            nodo4.setHermanoDerecho(nodo5);
            assertEquals("1\n" + //
                    "    2\n" + //
                    "    3\n" + //
                    "    4\n" + //
                    "    5\n" + //
                    "", arbol.listarIndentadoPorNiveles());
        }

        @Test
        void testListadoArbolConocido() {
            TNodoAG<Integer> nodo2 = new TNodoAG<Integer>(2, 2);
            TNodoAG<Integer> nodo3 = new TNodoAG<Integer>(3, 3);
            TNodoAG<Integer> nodo4 = new TNodoAG<Integer>(4, 4);
            TNodoAG<Integer> nodo5 = new TNodoAG<Integer>(5, 5);
            TNodoAG<Integer> nodo6 = new TNodoAG<Integer>(6, 6);
            TNodoAG<Integer> nodo7 = new TNodoAG<Integer>(7, 7);
            TNodoAG<Integer> nodo8 = new TNodoAG<Integer>(8, 8);
            TNodoAG<Integer> nodo9 = new TNodoAG<Integer>(9, 9);
            TNodoAG<Integer> nodo10 = new TNodoAG<Integer>(10, 10);
            TNodoAG<Integer> nodo11 = new TNodoAG<Integer>(11, 11);
            TNodoAG<Integer> nodo12 = new TNodoAG<Integer>(12, 12);
            nodo.setHijoIzquierdo(nodo2);
            nodo2.setHermanoDerecho(nodo3);
            nodo3.setHermanoDerecho(nodo4);
            nodo2.setHijoIzquierdo(nodo5);
            nodo5.setHermanoDerecho(nodo6);
            nodo6.setHermanoDerecho(nodo7);
            nodo4.setHijoIzquierdo(nodo8);
            nodo8.setHermanoDerecho(nodo9);
            nodo9.setHermanoDerecho(nodo10);
            nodo9.setHijoIzquierdo(nodo11);
            nodo11.setHijoIzquierdo(nodo12);
            assertEquals("1\n" + //
                    "    2\n" + //
                    "        5\n" + //
                    "        6\n" + //
                    "        7\n" + //
                    "    \n" + //
                    "    3\n" + //
                    "    4\n" + //
                    "        8\n" + //
                    "        9\n" + //
                    "            11\n" + //
                    "                12\n" + //
                    "        \n" + //
                    "        10\n" + //
                    "", arbol.listarIndentadoPorNiveles());

        }

        @Test
        void testListadoArbolVacio() {
            arbol = new TArbolG<Integer>();
            assertEquals("", arbol.listarIndentadoPorNiveles());
        }
    }
}