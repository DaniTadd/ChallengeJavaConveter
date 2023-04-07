# :arrows_counterclockwise: ChallengeJavaConveter
Second challenge from Oracle One Next Education Program - Currency and temperatures converter
<h2>:dart: Objetivo</h2>

<p>Este proyecto tiene pro objetivo dar solución al desafío número 2 del programa Oracle Next Education y propuesto por instructores de Alura.</p>
<p>El mismo consistía en crear una aplicación de escritorio con el uso del lenguaje Java para realizar conversiones de monedas.</p>
<p>Debido al nivel de conocimientos obtenido durante el curso no se exige el uso de una API.</p>
<p>En una versión futura de este mismo programa se incluirá la conección a una api que permita desarrollar un código más limpio y dinámico.</p>

<h2>:pencil: Descripción</h2>

<h3>:hammer: Funcionalidades del proyecto:</h3>
<ul>
  <li>Conversor de monedas:</li>
    <p>Conversiones entre peso argentino y las siguientes:</p>
    <ul>
      <li>:dollar: Dólar</li>
      <li>:euro: Euro</li>
      <li>:pound: Libra esterlina</li>
      <li>:yen: Yen</li>
      <li> ₩ Won</li>
    </ul>
    </br>
  <li>Conversor de temperaturas</li>
    <p>Conversiones entre las siguientes temperaturas:</p>
    <ul>
      <li>Celsius (°C)</li>
      <li>Fahrenheit (°F)</li>
      <li>Kelvin (K)</li>
    </ul>
</ul>
</br>

<h3>:wrench: Componentes</h3>

<p>Este proyecto, en su primera versión, fue realizado mediante el IDE Eclipse y la aplicación "Window Builder".</p>
<p>Los objetos de la interfaz gráfica fueron creados mediante el uso de la biblioteca Java Swing.</p>
<p>El programa consta de una ventana principal a través de la que se elige el convertidor que se desea usar, "Divisas" o "Temperaturas.</p>

<p align="center">
<img src="https://user-images.githubusercontent.com/121594162/230537615-033ea3de-05b2-49d4-805e-9d453247c661.PNG" width="450"/>
<img src="https://user-images.githubusercontent.com/121594162/230537617-fa370935-fb74-4fdf-ab36-838e9650f38f.PNG" width="450"/>
<img src="https://user-images.githubusercontent.com/121594162/230537618-83a914b6-ea95-4311-b13d-f06558114af0.PNG" width="450"/>
</p>

<h3>:computer: Aspectos del código</h3>

<p>El programa consta de 4 clases, una para cada una de las tres ventanas y otra para las operaciones de conversión.</p>
<p>La ventana "principal" tiene un JComboBox para seleccionar el tipo de conversor deseado y las ventanas de los conversores tienen un botón para abrir el otro conversor según corresponda.</p>
<p>El código para la conversión de temperaturas está realizado mediante una función "switch" que permite detectar qué JRadioButtons están seleccionados para determinar el cálculo a realizar.</p>
<p>El código para la conversión de monedas de una forma y viceversa está construido, en la primera versión del proyecto, mediante una función "switch" algo extensa que en una segunda versión será reemplazada por el uso de una API para lograr un código más limpio y con mejor funcionalidad.</P>
