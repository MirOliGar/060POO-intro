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

import org.japo.java.entities.Mascota;

/**
 *
 * @author Mireia Oliver García - mireia.oliver.11@gmail.com.
 */
public class App {

    public void launchApp() {

        Mascota m01 = new Mascota();
        System.out.println(m01.nombre);

        m01.nombre = "Loky";
        System.out.println(m01.nombre);
        
        Mascota m02 = new Mascota("Patata");
        System.out.println(m02);
    }

}
