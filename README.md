Video 1
nose puede automatizar toda la parte de ui
rebaja la cantidad de manual test case
tiempo de ejecucion corto con diferecia de maual testing ui test aotomatizado dura segundos
ui test enfocarse en a "end to end", work flows, flujos completos de la interacion de la aplicacion
progrmar tods los dias 
tener claro quen entradas esntra recibiendo y que es lo que tines validar de output y recien que es lo que vas automatizar 
TDD tes driven development. bateria de test Write a test watch it fail, write just enought code to pass the test, improve code without changing its behavior

video 2
https://formy-project.herokuapp.com/
f12 
dock to right 
Ctrl+f para buscar

CSS Selector

#first-name
input[placeholder="Enter first name"]
.form-group #first-name (space is descendant)
.form-group > div > #first-name (> is child)
strong + #first-name (+ is following sibling)
 Nota: CSS no tiene parent, ancestor o preceding.

XPath
//*[@id="first-name"]
//input[@id="first-name"]
//input[@placeholder="Enter first name"]
//label[@for="first-name"]/parent::strong/following-sibling::input
/html/body/div/form/div/div[1]/input
Problemas:
Uso de índices [1] puede ser frágil.
Evitar dependencias en atributos multilanguage como text, placeholder y title.

