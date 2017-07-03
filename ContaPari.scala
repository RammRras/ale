import scala.collection.parallel.ParIterableLike.Foreach

object ContaPariFor extends App {
  
  // CONTA CON FOR
  
  def contaPariFor( l : List[Int] ) = {
    
    var res : Int = 0
    
    for ( s <- l ) {
      if ( s % 2 == 0 ) res=res+1
    }
    
    res // ritorno il valore
    
  }
  
  // CONTA CON FOREACH
  
  def contaForEach( l : List[Int] ) : Int = {
    var res : Int = 0
    
    def countParBase ( num : Int ) = { 
        if ( num % 2 == 0 ) res=res+1
     }
    l.foreach( countParBase)
   
    res
   }
  
  // CONTA CON RICORSIVO
  
  def isPari( num : Int ) : Int = { if ( num % 2 == 0  ) 1 else 0 }
  
  def contaRicorsivo( l : List[Int] ) : Int = {
    
    var res : Int = 0
    
    if ( l.isEmpty ) res
    else res = isPari( l.head ) + contaRicorsivo( l.tail )
    
    res
    
  }
  
  // CONTA CON FOLD
  
 def contaPerFold( num : Int, conta : Int ) = { if ( num % 2 == 0  ) conta+1 else conta }
  
   def counterFold( l : List[Int] ) : Int = {
     l.foldLeft(0)( contaPerFold )
  }

   
   /*
    * Scrivi una higher order function contaP che generalizza il conteggio con un predicato generico P (funzione da int a boolean) che dato 
    * un intero x mi dice se x soddisfa P. contaP prede una lista di interi (List[Int]) e conta il numero di interi nella lista che soddisfano P. 
    * Usa il currying se riesci.
    */
   
   /*
    * 
  def contaP(p: Int => Boolean): (List[Int]) => Int = {
    def inner(l: List[Int]): Int = l.filter(p).size
    inner
  }
    */
  
   def contaP( p : Int => Boolean  ) : (List[Int]) => Int = {
     def inner(l: List[Int]): Int = l.filter(p).size
    inner
   }
   
   
  def pari(n: Int) = n % 2 == 0
   // funzione con nome
  def contaPari2(l: List[Int]): Int = contaP(pari)(l)
  // funzione anonima
  def contaPari2a(l: List[Int]): Int = contaP(x =>(x%2== 0))(l)
  
  override def main(args: Array[String]): Unit = {
    
    val l = List(0, 1, 2, 3, 4, 8, 52, 87, 9, 254, 5, 6) // 6 pari
    
    // se passo a println una funzione stampa già a schermo
    println( contaPariFor(l) )
    println( contaForEach(l) )
    println( contaRicorsivo(l) )
    println( counterFold(l) )
    println( ( l.filter(_ % 2 == 0) ).length )
    
  }
  
}