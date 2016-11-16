# reference
- [良葛格](http://openhome.cc/Gossip/DesignPattern/VisitorPattern.htm)

# class diagram [(ref)](http://openhome.cc/Gossip/DesignPattern/VisitorPattern.htm)
![jpg](https://github.com/rcschen/design-pattern-exercise/blob/master/visitor/Visitor-1.jpg)

# python version
```
class Customer:
    def doCustomer(self):
        print("客戶服務")
    
    def pay(self):
        print("結帳")
    
    def accept(self, visitor): pass

class Member(Customer):
    def doMember(self):
        print("會員服務")
    
    def accept(self, visitor):
        visitor.visitMember(self)
    
class VIP(Customer):
    def doVIP(self):
        print("VIP 服務")
        
    def accept(self, visitor):
        visitor.visitVIP(self)

class VisitorImpl:
    def visitMember(self, member):
        member.doMember();
    
    def visitVIP(self, vip):
        vip.doVIP()
    
class Service:
    def __init__(self):
        self.visitor = VisitorImpl()
    
    def doService(self, customer):
        customer.doCustomer()
        customer.accept(self.visitor)
        customer.pay()

service = Service()
service.doService(VIP())
```
