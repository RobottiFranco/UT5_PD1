package ut5pd1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.swing.text.html.parser.Element;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;

public class TNodoAGTests {
    @Nested
    class insertarTests {
        TNodoAG<Integer> nodo;

        @BeforeEach

        void SetUp() {
            nodo = new TNodoAG<Integer>(1, 1);
        }

        @Test
        void testInsercionInvalida() {
            nodo.insertar(2, 3);
            assertEquals(null, nodo.getHijoIzquierdo());
            assertEquals(null, nodo.getHermanoDerecho());
        }

        @Test
        void testInsercionValida() {
            nodo.insertar(2, 1);
            assertEquals(2, nodo.getHijoIzquierdo().getEtiqueta());
        }

        @Test
        void testInsercionValidaSubarbolConocido() {
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
            nodo.insertar(13, 12);
            nodo.insertar(14, 6);
            nodo.insertar(15, 2);
            assertEquals(13, nodo12.getHijoIzquierdo().getEtiqueta());
            assertEquals(14, nodo6.getHijoIzquierdo().getEtiqueta());
            assertEquals(15, nodo7.getHermanoDerecho().getEtiqueta());
        }

        @Test
        void testInsercionInvalidaSubarbolConocido() {
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
            assertEquals(false, nodo.insertar(13, 13));
            assertEquals(false, nodo.insertar(14, 14));
        }
    }

    @Nested
    class buscarTests {
        TNodoAG<Integer> nodo;

        @BeforeEach

        void SetUp() {
            nodo = new TNodoAG<Integer>(1, 1);
        }

        @Test
        void testBusquedaExitosaSubarbolConocido() {
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
            nodo.insertar(13, 12);
            nodo.insertar(14, 6);
            nodo.insertar(15, 2);
            for (int i = 1; i < 13; i++) {
                assertEquals(true, nodo.buscar(i));
            }

        }

        @Test
        void testBusquedaNoExitosaSubarbolConocido() {
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
            for (int i = -5; i < 1; i++) {
                assertEquals(false, nodo.buscar(i));
            }
            for (int i = 13; i < 20; i++) {
                assertEquals(false, nodo.buscar(i));
            }
        }
    }

    @Nested
    class listarIndentadoPorNivelesTests {
        TNodoAG<Integer> nodo;

        @BeforeEach

        void SetUp() {
            nodo = new TNodoAG<Integer>(1, 1);
        }

        @Test
        void testListadoSubarbol2Niveles() {
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
                    "", nodo.listarIndentadoPorNiveles());
        }

        @Test
        void testListadoSubarbolConocido() {
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
                    "", nodo.listarIndentadoPorNiveles());
        }
    }
}