

object somma2 {
  
  def sommaGTX1( lista : List[Double], soglia : Double ) : Double = {
    
    var somma : Double = 0;
    for ( num <- lista ) {
      if ( num >= soglia ) somma = somma + num; 
    }
    somma*2
    
  }
  
  def sommaGTX2( lista : List[Double], soglia : Double ) : Double = {
    
    var somma : Double = 0;
    /*for ( num <- lista ) {
      if ( num >= soglia ) somma = somma + num; 
    }
    * 
    */
    
    def sommaforeach( num : Double ) = {
      if ( num >= soglia ) somma = somma + num;
    }
    
    lista.foreach( sommaforeach );
    
    somma*2;
    
  }
  
    def sommaGTX3( lista : List[Double], soglia : Double, somma : Double ) : Double = {

      if ( lista.isEmpty ) return somma*2;
      else {
        if ( lista.head >= soglia) sommaGTX3( lista.tail, soglia, somma+lista.head)
        else sommaGTX3( lista.tail, soglia, somma )
      }
    }
    
def sommaGTX4( lista : List[Double], soglia : Double ) : Double = {

    def sommaforeach( num : Double ) : Boolean = {
      num >= soglia
    }
    
    val listanuova : List[Double] = lista.filter( sommaforeach );
    
    somma(listanuova);
    
  }

def sommaGTX5( lista : List[Double], soglia : Double ) : Double = {

    def sommaforeach( num : Double ) : Double = {
      if ( num >= soglia ) num
      else 0;
    }
    
    val listanuova : List[Double] = lista.map( sommaforeach );
    
    somma(listanuova);
    
  }


 def maggioredi(num: Double, soglia : Double) :Double = {
   if ( num >= soglia ) num
   else 0
 }
 
 
def sommaGTX6( lista : List[Double], soglia : Double ) : Double = {

  val somma : Double = lista.foldLeft(0.0)( (num, somma) => somma + maggioredi(num, soglia) )
    somma*2;
  }

def somma( lista : List[Double] ) : Double = {
   var somma : Double = 0;
    for ( num <- lista ) {
      somma = somma + num; 
    }
    somma*2
}
    
    
  
  
 def main(args: Array[String]) {
   
   val soglia : Double = 3.5;
   val lista : List[Double] = List( 1, 2, 3, 4, 5, 6 );
   
   println( "sommaGTX1: " + sommaGTX1(lista, soglia) );
   println( "sommaGTX2: " + sommaGTX2(lista, soglia) );
   println( "sommaGTX3: " + sommaGTX3(lista, soglia, 0) );
   println( "sommaGTX4: " + sommaGTX4(lista, soglia) );
   println( "sommaGTX5: " + sommaGTX5(lista, soglia) );
   println( "sommaGTX6: " + sommaGTX6(lista, soglia) );
 }
  
  
}