

object Esercizio {
  
  // CILCO FOR
  def ae1( stringa : List[Char] ) : String = {
     
     var i = 0;
     var risultato = ""
     for( c <- stringa  ) {
       if ( c == 'a' ) risultato += 'e'
       else if ( c == 'e' ) risultato += 'a'
       else risultato += c
     }
    
    return risultato
    
  }
  
  // FOREACH
  def ae2( stringa : List[Char] ) : String = {
    
    var risultato = "";
     
    def sostituzione( c : Char ) = {
       if ( c == 'a' ) risultato += 'e'
       else if ( c == 'e' ) risultato += 'a'
       else risultato += c
    }

    stringa.foreach(sostituzione)
  
    return risultato
    
  }
  
  // NO TAIL
  def ae3( stringa : List[Char] ) : String = {
    if ( stringa.isEmpty ) return ""
    else if ( stringa.head == 'e' ) return 'a' + ae3( stringa.tail )
    else if ( stringa.head == 'a' ) return 'e' + ae3( stringa.tail )
    else return stringa.head + ae3( stringa.tail )
  }
  
  // TAIL
  def ae4( stringa : List[Char], res : String ) : String = {
    if ( stringa.isEmpty ) return res
    else if ( stringa.head == 'e' ) return ae4( stringa.tail, res + 'a' )
    else if ( stringa.head == 'a' ) return ae4( stringa.tail, res + 'e' )
    else return ae4( stringa.tail, res + stringa.head )
  }
  
  
  def main(args: Array[String]): Unit = {
    
    
    var prova = "angelo"
    
    println( ae1(prova.toList) )
    println( ae2(prova.toList) )
    println( ae3(prova.toList) )
     println( ae4(prova.toList, "") )
  }
}