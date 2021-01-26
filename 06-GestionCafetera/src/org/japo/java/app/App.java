/* 
 * Copyright 2020 Mireia Oliver García <mireia.oliver.11@gmail.com>.
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
package org.japo.java.app;

import org.japo.java.entities.Pedido;

/**
 *
 * @author Mireia Oliver García - mireia.oliver.11@gmail.com.
 */
public class App {

    public static final int ITEM_OK = Pedido.ID_BATIDO;
    public static final int ITEM_NO = 999;

    public void launchApp() {

        //Objeto predeterminado
        Pedido p01 = new Pedido();
        System.out.println(Pedido.obtenerDescripcion(p01.getItem()));
        //Valor legal
        p01.setItem(ITEM_OK);
        System.out.println(Pedido.obtenerDescripcion(p01.getItem()));
        //Valor illegal
        p01.setItem(ITEM_NO);
        System.out.println(Pedido.obtenerDescripcion(p01.getItem()));

        System.out.println("---");

        //Objeto parametrizado
        Pedido p02 = new Pedido(ITEM_OK);
        System.out.println(Pedido.obtenerDescripcion(p02.getItem()));
        //Valor legal
        p02.setItem(ITEM_OK);
        System.out.println(Pedido.obtenerDescripcion(p02.getItem()));
        //Valor illegal
        p02.setItem(ITEM_NO);
        System.out.println(Pedido.obtenerDescripcion(p02.getItem()));
    }

}
