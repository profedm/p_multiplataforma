import sys
sys.path.append("../include")
from HelloW import HelloWorld

obj=HelloWorld()
obj.Say_Hello()

obj2=HelloWorld("Que chingue su madre el America")
obj2.Say_Hello()
