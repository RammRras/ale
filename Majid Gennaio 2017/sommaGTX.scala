

object sommaGTX {
  
  def sommaGTX1( lista: List[Double], x: Double ) : Double = {
    
    var somma : Double = 0;
    for ( num <- lista ) {
      if ( num >= x ) somma = somma + num;
    }
    somma*2;
    
  }
  
  def sommaGTX2( lista: List[Double], x: Double ) : Double = {
    
    var somma : Double = 0;
    
    def sommaNumero( num : Double ) {
      if ( num >= x ) somma = somma + num;
    }
    
    
    lista.foreach( sommaNumero );
    somma*2;
    
  }
  
   def sommaGTX3( lista: List[Double], x: Double, somma : Double ) : Double = {
     
     if ( lista.isEmpty ) return 2*somma;
     else {
       
       if ( lista.head >= x )  sommaGTX3( lista.tail, x, somma+lista.head );
       else sommaGTX3( lista.tail, x, somma );
       
     }
     
     
   }
   
   def sommaGTX4( lista: List[Double], x: Double ) : Double = {
    
    
    
    def maggioreDiSoglia( num : Double ) : Boolean = {
      if ( num >= x ) true;
      else false;
    }
    
    
    val listapulita = lista.filter( maggioreDiSoglia )
   
    somma(listapulita)
    
  }
   
   def sommaGTX5( lista: List[Double], x: Double ) : Double = {

       somma( lista.map( n => if (n >= x) n else 0 )  );
        
    
  }
 
  
   
    def somma(lista: List[Double]) : Double = {
    var somma : Double = 0;
    for ( num <- lista ) {
     somma = somma + num;
    }
    somma*2;
   }
 
/* def main(args: Array[String]): Unit = {
     
    val list : List[Double] = List( 1, 2, 3, 4, 5, 6);
    val soglia = 3.5;
    
    println( sommaGTX1( list, soglia ) );
    println( sommaGTX2( list, soglia ) );
    println( sommaGTX3( list, soglia, 0 ) );
    println( sommaGTX4( list, soglia ) );
    println( sommaGTX5( list, soglia ) );
  }
  */
}