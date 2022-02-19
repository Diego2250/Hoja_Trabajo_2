    /**
    * @author Diego Morales
    */
    class CalculadoraPosfix implements IPosfixCalc{
        
        Stack<Integer> Stack = new Stack<Integer>();
        
        public int resultado;
        
        /**
         * 
         * @param expresion
         * @return resultado
         */
        @Override
        public int Evaluate(String expresion) {
            String data = expresion;
            String[] split = data.split(" ");
            for (int i=0; i<split.length; i++) {
                switch(split[i]) {
                case "*": 	
                    int x = Stack.pull();
                    int y = Stack.pull();
                    int resul = (y * x);
                        Stack.push(resul);
                    i++;
                    break;
                case "/":
                    int a = Stack.pull();	
                    int b = Stack.pull();
                    int resu = (b / a);
                        Stack.push(resu);
                    break;
                case "+":
                    int c = Stack.pull();	
                    int d = Stack.pull();
                    int r = (d + c);
                        Stack.push(r);
                    break;
                case "-":
                    int e = Stack.pull();
                    int f = Stack.pull();
                    int re = (f - e);
                        Stack.push(re);
                    break;
                default: 
                    int z = Integer.valueOf((String) split[i]);
                    Stack.push(z);
                    break;
                    
                }
                
            }
                if(Stack.size() == 1) {
                    resultado = (Stack.pull());
                }
            
            return resultado;
        }

    }