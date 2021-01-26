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
public class Mandocleta {

    //Constantes
    public static final double DEF_VELOCIDAD = 0;
    public static final double MIN_VELOCIDAD = -1.5;
    public static final double MAX_VELOCIDAD = 1.5;

    //Variables
    private double velocidad;

    public Mandocleta() {
        velocidad = DEF_VELOCIDAD;
    }

    public Mandocleta(double velocidad) {
        if (validarVelocidad(velocidad)) {
            this.velocidad = velocidad;
        } else {
            this.velocidad = DEF_VELOCIDAD;
        }

    }

    private boolean validarVelocidad(double velocidad) {
        return velocidad >= MIN_VELOCIDAD && velocidad <= MAX_VELOCIDAD;
    }

    /**
     * @return the velocidad
     */
    public double getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(double velocidad) {
        if (validarVelocidad(velocidad)) {
            this.velocidad = velocidad;
        }
    }

}
