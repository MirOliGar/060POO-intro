/*
 * Copyright 2021 Mireia Oliver García <mireia.oliver.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.entities;

/**
 *
 * @author Mireia Oliver García <mireia.oliver.alum@iescamp.es>
 */
public class Pedido {

    //Productos disponibles - ID
    public static final int ID_AGUA = 35;
    public static final int ID_REFRESCO = 42;
    public static final int ID_BATIDO = 27;

    //Productos disponibles - DESCRIPCIONES
    public static final String DES_AGUA = "Agua";
    public static final String DES_REFRESCO = "Refresco";
    public static final String DES_BATIDO = "Batido";

    //Valor predeterminado
    public static final int DEF_ITEM = ID_AGUA;

    //Atributo
    private int item;

    //Constructor predeterminado
    public Pedido() {
        item = DEF_ITEM;
    }

    //Constructor parametrizado
    public Pedido(int item) {
        if (validarItem(item)) {
            this.item = item;
        } else {
            this.item = DEF_ITEM;
        }

    }

    //Setters y getters
    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        if (validarItem(item)) {
            this.item = item;
        }
    }

    @Override
    public String toString() {
        return String.format("Item ...: %d (%s)", item, obtenerDescripcion(item));
    }

    @Override
    public boolean equals(Object o) {

        boolean testOK;

        if (o == null) {
            testOK = false;
        } else if (!(o instanceof Pedido)) {
            testOK = false;
        } else {
            Pedido p = (Pedido) o;
            testOK = item == p.item;
        }

        return testOK;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.item;
        return hash;
    }

    //Validación (Para cuando introducimos valor en app)
    private boolean validarItem(int item) {
        return item == ID_AGUA || item == ID_REFRESCO || item == ID_BATIDO;
    }

    public static final String obtenerDescripcion(int item) {
        String des;

        switch (item) {

            case ID_REFRESCO:
                des = DES_REFRESCO;
                break;
            case ID_BATIDO:
                des = DES_BATIDO;
                break;
            case ID_AGUA:
            default:
                des = DES_AGUA;
        }

        return des;
    }

    //El resto de métodos
}
