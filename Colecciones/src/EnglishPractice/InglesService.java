/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnglishPractice;

import java.util.*;

/**
 *
 * @author JesusNjo
 */
public class InglesService {

    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public void menu() {
        System.out.println("Menu");
        int op = 0;
        do {

            System.out.println("1: Verbos\n2:Was-Were / Was'nt-Were'nt\n3:did/did'nt\n4:What's\n5:Conectivos\n0:Salir");

            op = input.nextInt();
            switch (op) {

                case 1:
                    verbos(new HashMap());
                    break;
                case 2:
                    wasWere(new HashMap());
                    break;
                case 3:
                    did(new HashMap());
                    break;
                case 4:
                    whats(new HashMap());
                    break;
                case 5:
                    conective(new HashMap());
                    break;

                case 0:
                    System.out.println("Saliendo");
                    break;
            }

        } while (op != 0);
    }

    public void verbos(Map<String, String> verb) {
        List<InglesClass> fraseV = new ArrayList();

        fraseV.add(new InglesClass("I am very happy because the sun is shining and the birds are singing.", "Estoy muy feliz porque el sol esta brillando y los pajaros estan cantando"));
        fraseV.add(new InglesClass("She does her homework every day after school and always gets good grades", "Ella hace su tarea todos los dias despues de la escuela y siempre saca buenas notas"));
        fraseV.add(new InglesClass("He has a big book collection and loves to read in his free time.", "El tiene una gran coleccion de libros y le encanta leer en su tiempo libre"));
        fraseV.add(new InglesClass("They are at home watching a movie and eating popcorn.", "Ellos estan en casa viendo una pelicula y comiendo palomitas de maiz"));
        fraseV.add(new InglesClass("I do not like coffee because it makes me feel jittery and anxious.", "No me gusta el cafe porque me hace sentir nervioso y ansioso"));
        fraseV.add(new InglesClass("She is always very kind and helpful to her friends.", "Ella es siempre muy amable y servicial con sus amigos."));
        fraseV.add(new InglesClass("He does not like to play sports because he prefers to read books.", "El no le gusta jugar deportes porque prefiere leer libros"));

        fraseV.add(new InglesClass("They have a big garden with many flowers and vegetables.", "Ellos tienen un gran jardin con muchas flores y verduras"));
        fraseV.add(new InglesClass("I am not very good at math but I am trying to improve.", "No soy muy bueno en matematicas pero estoy tratando de mejorar"));

        fraseV.add(new InglesClass("She has a beautiful voice and loves to sing in front of an audience.", "Ella tiene una voz hermosa y le encanta cantar frente a una audiencia"));

        for (int i = 0; i < fraseV.size(); i++) {
            verb.put(fraseV.get(i).getFrase(), fraseV.get(i).getTraduccion());
        }

        for (Map.Entry<String, String> entry : verb.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println("Ingrese la traduccion de: " + key);
            String traduc = input.next();
            if (traduc.equalsIgnoreCase(value)) {
                System.out.println("Traduccion correcta..");
            } else {
                System.out.println("Traduccion incorrecta..");
                System.out.println("Escribio: " + traduc);
                System.out.println("Correcta: " + value + "\n");
                System.out.println("----");

            }
        }

    }

    public void wasWere(Map<String, String> ww) {
        List<InglesClass> frasew = new ArrayList();
        System.out.println("Eliga si las oraciones seran afirmativas o negativas\nA/N");
        String op = input.next();
        if ("a".equalsIgnoreCase(op)) {

            frasew.add(new InglesClass("I was at the park yesterday.", "Estuve en el parque ayer."));
            frasew.add(new InglesClass("She was very happy to see her friends.", "Ella estuvo muy feliz de ver a sus amigos"));
            frasew.add(new InglesClass("He was reading a book in the library.", "El estaba leyendo un libro en la biblioteca"));
            frasew.add(new InglesClass("They were playing soccer in the field.", "Ellos estaban jugando futbol en el campo"));
            frasew.add(new InglesClass("We were having a great time at the party.", "Nosotros estabamos pasando un buen rato en la fiesta"));
            frasew.add(new InglesClass("The cat was sleeping on the couch.", "El gato estaba durmiendo en el sofa"));
            frasew.add(new InglesClass("The flowers were blooming in the garden.", "Las flores estaban floreciendo en el jardin"));
            frasew.add(new InglesClass("The sky was very blue and clear.", "El cielo estaba muy azul y despejado"));
            frasew.add(new InglesClass("The children were laughing and playing together.", "Los niños estaban riendo y jugando juntos"));
            frasew.add(new InglesClass("The food was delicious and everyone enjoyed it.", "La comida estaba deliciosa y todos la disfrutaron"));
        } else if ("n".equalsIgnoreCase(op)) {

            frasew.add(new InglesClass("I wasn’t at home yesterday.", "No estuve en casa ayer"));
            frasew.add(new InglesClass("She wasn’t feeling well.", "Ella no se sentia bien"));
            frasew.add(new InglesClass("He wasn’t at the meeting.", "El no estaba en la reunion"));
            frasew.add(new InglesClass("They weren’t interested in the movie.", "Ellos no estaban interesados en la pelicula"));
            frasew.add(new InglesClass("We weren’t able to finish the project on time.", "No pudimos terminar el proyecto a tiempo"));
            frasew.add(new InglesClass("The dog wasn’t barking.", "El perro no estaba ladrando"));
            frasew.add(new InglesClass("The cookies weren’t ready yet.", "Las galletas aun no estaban listas"));
            frasew.add(new InglesClass("The weather wasn’t very nice.", "El clima no estaba muy agradable"));
            frasew.add(new InglesClass("The students weren’t paying attention.", "Los estudiantes no estaban prestando atencion"));
            frasew.add(new InglesClass("The car wasn’t working properly.", "El coche no estaba funcionando correctamente"));
        } else {
            System.out.println("Opcion invalida");
        }
        for (int i = 0; i < frasew.size(); i++) {
            ww.put(frasew.get(i).getFrase(), frasew.get(i).getTraduccion());
        }

        for (Map.Entry<String, String> entry : ww.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println("Ingrese la traduccion de: " + key);
            String traduc = input.next();
            if (traduc.equalsIgnoreCase(value)) {
                System.out.println("Traduccion correcta..");
            } else {
                System.out.println("Traduccion incorrecta..");
                System.out.println("Escribio: " + traduc);
                System.out.println("Correcta: " + value + "\n");
                System.out.println("----");

            }
        }

    }

    public void did(Map<String, String> didD) {
        List<InglesClass> frasel = new ArrayList();
        System.out.println("Eliga si las oraciones seran afirmativas o negativas\nA/N");
        String op = input.next();

        if ("a".equalsIgnoreCase(op)) {

            frasel.add(new InglesClass("I did my homework.", "Hice mi tarea"));

            frasel.add(new InglesClass("She did a great job.", "Ella hizo un gran trabajo"));

            frasel.add(new InglesClass("He did the dishes.", "El lavo los platos"));

            frasel.add(new InglesClass("They did their best.", "Ellos hicieron lo mejor que pudieron"));

            frasel.add(new InglesClass("We did everything we could.", "Hicimos todo lo que pudimos"));

            frasel.add(new InglesClass("The cat did catch the mouse.", "El gato si atrapo al raton"));

            frasel.add(new InglesClass("The flowers did bloom in spring.", "Las flores si florecieron en primavera"));

            frasel.add(new InglesClass("The sky did turn red at sunset.", "El cielo si se torno rojo al atardecer."));

            frasel.add(new InglesClass("The children did have fun at the park.", "Los niños si se divirtieron en el parque."));

            frasel.add(new InglesClass("The food did taste amazing.", "La comida si sabia increible."));
        } else if ("n".equalsIgnoreCase(op)) {

            frasel.add(new InglesClass("I didn’t go to the party.", "No fui a la fiesta"));

            frasel.add(new InglesClass("She didn’t like the movie.", "A ella no le gusto la pelicula"));

            frasel.add(new InglesClass("He didn’t finish his homework.", "El no termino su tarea"));

            frasel.add(new InglesClass("They didn’t want to go to the beach.", "Ellos no querian ir a la playa"));

            frasel.add(new InglesClass("We didn’t have enough time to finish the project.", "No tuvimos suficiente tiempo para terminar el proyecto"));

            frasel.add(new InglesClass("The dog didn’t bark at the mailman.", "El perro no ladro al cartero"));

            frasel.add(new InglesClass("The cookies didn’t turn out well.", "Las galletas no salieron bien"));

            frasel.add(new InglesClass("The weather didn’t improve during the day.", "El clima no mejoro durante el dia"));

            frasel.add(new InglesClass("The students didn’t understand the lesson.", "Los estudiantes no entendieron la leccion"));

            frasel.add(new InglesClass("The car didn’t start this morning.", "El coche no arranco esta mañana"));
        } else {
            System.out.println("Opcion invalida");
        }
        for (int i = 0; i < frasel.size(); i++) {
            didD.put(frasel.get(i).getFrase(), frasel.get(i).getTraduccion());
        }

        for (Map.Entry<String, String> entry : didD.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println("Ingrese la traduccion de: " + key);
            String traduc = input.next();
            if (traduc.equalsIgnoreCase(value)) {
                System.out.println("Traduccion correcta..");
            } else {
                System.out.println("Traduccion incorrecta..");
                System.out.println("Escribio: " + traduc);
                System.out.println("Correcta: " + value + "\n");
                System.out.println("----");

            }
        }

    }

    public void whats(Map<String, String> wh) {
        List<InglesClass> frased = new ArrayList();
        System.out.println("Eliga si las oraciones seran afirmativas o negativas\nA/N");
        String op = input.next();
        if ("a".equalsIgnoreCase(op)) {
            frased.add(new InglesClass("What do you like?", "Que te gusta"));

            frased.add(new InglesClass("What does he eat?", "Que come el"));

            frased.add(new InglesClass("What did she say?", "Que dijo ella"));

            frased.add(new InglesClass("What were they doing?", "Que estaban haciendo ellos"));

            frased.add(new InglesClass("What was the weather like?", "Como estaba el clima"));

            frased.add(new InglesClass("What could we do?", "Que podriamos hacer"));

            frased.add(new InglesClass("What should I wear?", "Que deberia usar"));

            frased.add(new InglesClass("What would you like to drink?", "Que te gustaria beber"));

            frased.add(new InglesClass("What do you study?", "Que estudias"));

            frased.add(new InglesClass("What does she think?", "Que piensa ella"));
        } else if ("n".equalsIgnoreCase(op)) {
            frased.add(new InglesClass("What don’t you like?", "Que no te gusta"));

            frased.add(new InglesClass("What doesn’t he eat?", "Que no come el"));

            frased.add(new InglesClass("What didn’t she say?", "Que no dijo ella"));

            frased.add(new InglesClass("What weren’t they doing?", "Que no estaban haciendo ellos"));

            frased.add(new InglesClass("What wasn’t the weather like?", "Como no estaba el clima"));

            frased.add(new InglesClass("What couldn’t we do?", "Que no podriamos hacer"));

            frased.add(new InglesClass("What shouldn’t I wear?", "Que no deberia usar"));

            frased.add(new InglesClass("What wouldn’t you like to drink?", "Que no te gustaria beber"));

            frased.add(new InglesClass("What don’t you study?", "Que no estudias"));

            frased.add(new InglesClass("What doesn’t she think?", "Que no piensa ella"));

        } else {
            System.out.println("Opcion invalida");
        }
        for (int i = 0; i < frased.size(); i++) {
            wh.put(frased.get(i).getFrase(), frased.get(i).getTraduccion());
        }

        for (Map.Entry<String, String> entry : wh.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println("Ingrese la traduccion de: " + key);
            String traduc = input.next();
            if (traduc.equalsIgnoreCase(value)) {
                System.out.println("Traduccion correcta..");
            } else {
                System.out.println("Traduccion incorrecta..");
                System.out.println("Escribio: " + traduc);
                System.out.println("Correcta: " + value + "\n");
                System.out.println("----");

            }
        }
    }

    public void conective(Map<String, String> conec) {

        List<InglesClass> frasec = new ArrayList();
        System.out.println("Eliga si las oraciones seran afirmativas o negativas\nA/N");
        String op = input.next();

        if ("a".equalsIgnoreCase(op)) {
            frasec.add(new InglesClass("At least, I did my homework.", "Al menos, hice mi tarea"));

            frasec.add(new InglesClass("However, he ate his breakfast.", "Sin embargo, el comio su desayuno"));

            frasec.add(new InglesClass("Until now, she said nothing.", "Hasta ahora, ella no dijo nada"));

            frasec.add(new InglesClass("Toward the end, they finished the project.", "Hacia el final, ellos terminaron el proyecto"));

            frasec.add(new InglesClass("While it was raining, I read a book.", "Mientras llovia, lei un libro"));

            frasec.add(new InglesClass("Instead of going out, we stayed home.", "En lugar de salir, nos quedamos en casa"));

            frasec.add(new InglesClass("Let me get this straight, you want to leave?", "Dejame entender esto bien, quieres irte"));

            frasec.add(new InglesClass("While he was sleeping, she watched TV.", "Mientras el dormia, ella veia TV"));

            frasec.add(new InglesClass("Due to the weather, the game was cancelled.", "Debido al clima, el juego fue cancelado"));

            frasec.add(new InglesClass("At least, he tried his best.", "Al menos, el hizo su mejor esfuerzo"));
        } else if ("n".equalsIgnoreCase(op)) {

        } else {
            System.out.println("Opcion invalida");
        }
        for (int i = 0; i < frasec.size(); i++) {
            conec.put(frasec.get(i).getFrase(), frasec.get(i).getTraduccion());
        }

        for (Map.Entry<String, String> entry : conec.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println("Ingrese la traduccion de: " + key);
            String traduc = input.next();
            if (traduc.equalsIgnoreCase(value)) {
                System.out.println("Traduccion correcta..");
            } else {
                System.out.println("Traduccion incorrecta..");
                System.out.println("Escribio: " + traduc);
                System.out.println("Correcta: " + value + "\n");
                System.out.println("----");

            }

        }
    }
}
