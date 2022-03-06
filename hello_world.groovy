//program
def alma = 43;
int korte = 14;
szoveg = 'ez itt egy szöveg helye';

def MultilineString = '''első sor
masodik sor
harmadik sorom'''

def name = 'Dave' // a plain string
def greeting = "Hello ${name}"

assert greeting.toString() == 'Hello Dave'

def person = [name: 'Anna', age: 26, tel:34245386]

//if
double fugveny(int be,int mas){
    if(be>=mas && be>0){
        be=be**2
    }else{
        be=mas**2
    }
    return (be+33.312)
}

//array
def letters = ['a', 'b', 'c', 'd']

letters[2] = 'C'
letters << 'e'
letters <<  'G'

def a = 4
a += 3

def arr = [[0, 1], [2, 3]]
arr [0][2]=5
arr [1][1]=a

def gyumi (){
    //contrains
    String[] gyumolcs = ["alma", "korte", "banan", "szilva"]
    if ("banan" in gyumolcs){
        print("Van banan \n")
    }
}

//matrix
Integer[][] matrix1
matrix1 = [[1, 2], [3, 4, 3], [2, 4]]

//function
def tartalmazza (String be){
    String[] groovyBooks = [ 'Groovy in Action', 'Making Java Groovy' ]
    if (groovyBooks.every{ it.contains(be) })
    {
        return "Tartalmazza"
    }else{
        return "Nincsen talalat"
    }
}
def point (String str){
    def fun = str.&toUpperCase
    def upper = fun()
    if(upper == str.toUpperCase()){
        return true
    }else{
        return false
    }
}

def namelist (){
    def list = ['Bob', 'Dave','Steve', 'Anna', 'Emma', 'Richard', 'Eva']
    return list.sort()
}

def whenthen() {
    given:
    def list = [1, 2, 3, 4]

    when:
    list.remove(0)

    then:
    list == [2, 3, 4]
}

//CARS
class Car {
    String make
    String model
    int year
}

def CARRS(){
    def cars = [
            new Car(make: 'Peugeot', model: '508', year:2004),
            new Car(make: 'Opel', model: 'Astra', year:2002),
            new Car(make: 'Honda', model: 'Jazz', year:2005),
            new Car(make: 'Renault', model: 'Clio',year:1998)]
    def makes = cars*.make
    def models = cars*.model
    assert makes == ['Peugeot', 'Opel', 'Honda', 'Renault']
    assert 'Astra' == models?[1]      //true
    assert !models.is(makes)        //true
    return models.sort()
}

//numbers
int function(int x, int y, int z) {
    x*y+z
}
def number = [6,2,3]

def collection (){
    return (1..8).collect()
}

int fibona(int n) {
    n < 2 ? 1 : fibona(n-1) + fibona(n-2)
}

int power(int n) { 2**n }
def hello = { "Hello, $it!" }


//classes
class Food {
    int id
    String name
    int price
}

def getrand(){
    Random rnd = new Random()
    return rnd
}

def Foods (int number){

    def Pizza = new Food( id:0,  name: 'Salami Pizza', price: 1490)
    def Spagetti = new Food( id:1,  name: 'Italian Spagetti', price: 1290)
    def Nutella = new Food( id:2,  name: 'Ferrero Nutella', price: 2390)
    def Ananas = new Food( id:3,  name: 'Hawai Ananas', price: 890)

    def list = [Pizza, Spagetti, Nutella, Ananas]

    def ered = list[getrand().nextInt(number)]

    /*
    return cup.delegate = Pizza
    return list[rnd.nextInt(3)]
    return (list[getrand().nextInt(number)].name.toUpperCase())
    */
    return (ered.name.toUpperCase() + " - " +ered.price + "-ft")
}
//copy string
def copying (instr, int kor){
    def nCopies = { int n, String str -> str*n }
    def blah = nCopies.rcurry(instr)
    assert blah(kor) == nCopies(kor, instr)
    return (blah(kor))
}


//nyomtatasi fugveny
def nyomtat (func){
    print(func)
    print("\n")
}

//clear
System.out.print("\033[H\033[2J");
System.out.flush();
//kiiratas
print("----------------------------\n")
print "Hello World!\n"
print (alma + korte)
print("\n" as java.lang.Object)
print(szoveg + "\n" + MultilineString + "\n")
print(greeting + "\n")
print ("$person.name is $person.age years old +$person.tel mobile \n")
nyomtat(arr)
nyomtat(fugveny(-1,21))
nyomtat(matrix1)
nyomtat(letters)
nyomtat(tartalmazza('in'))
gyumi()
nyomtat(point('bemeneti kezdo ertek'))
nyomtat(namelist())
nyomtat(whenthen())
nyomtat(CARRS())
nyomtat("${function(number)} sima")
nyomtat("${function(*number)} csillag")
nyomtat("kollekcio:${collection()}")
nyomtat("${fibona(12)} = fibona 12")
nyomtat("2^6==${power(6)}")
nyomtat("${hello('Dave')} (\$it hasznalata)")
nyomtat(copying('egy - ketto | ', 3))
nyomtat(Foods(4))

print("----------------------------\n")
print("\n")
