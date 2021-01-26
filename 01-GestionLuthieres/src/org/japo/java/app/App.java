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

import java.util.Locale;
import org.japo.java.entities.Mandocleta;

/**
 *
 * @author Mireia Oliver García - mireia.oliver.11@gmail.com.
 */
public class App {

    public static final double VELOCIDAD = 1;
    public static final double VELOCIDAD2 = 10;

    public void launchApp() {
        //Primer valor
        Mandocleta m01 = new Mandocleta();
        System.out.printf(Locale.ENGLISH, "Velocidad: %.1fm/s%n", m01.getVelocidad());
        //Comprobar valor legal
        m01.setVelocidad(VELOCIDAD);
        System.out.printf(Locale.ENGLISH, "Velocidad: %.1fm/s%n", m01.getVelocidad());
        //Comprobar valor ilegal
        m01.setVelocidad(VELOCIDAD2);
        System.out.printf(Locale.ENGLISH, "Velocidad: %.1fm/s%n", m01.getVelocidad());

        //Segundo valor
        Mandocleta m02 = new Mandocleta(VELOCIDAD2);
        System.out.printf(Locale.ENGLISH, "Velocidad: %.1fm/s%n", m02.getVelocidad());
        //Comprobar valor legal
        m02.setVelocidad(VELOCIDAD);
        System.out.printf(Locale.ENGLISH, "Velocidad: %.1fm/s%n", m02.getVelocidad());
        //Comprobar valor ilegal
        m02.setVelocidad(VELOCIDAD2);
        System.out.printf(Locale.ENGLISH, "Velocidad: %.1fm/s%n", m02.getVelocidad());
    }

}
