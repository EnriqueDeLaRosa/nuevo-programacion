/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Packaje;

/**
 *
 * @author Enrique
 */
public class EqualsIsNot {
    
public boolean equalIsNot(String str) {
    str="is";
  str = str.replaceAll(" ", "");
  int contis=0;
  int contnot=0;
  for(int i=0;i<str.length()-1;i++){
    if(str.substring(i,i+2).equals("is")){
      contis=contis+1;
    }
  }
    for(int i=0;i<str.length()-2;i++){
  if(str.substring(i,i+3).equals("not")){
      contnot=contnot+1;
    }
    }
    if(contis==contnot){
      return true;
    }else{
      return false;
    }
}

}
