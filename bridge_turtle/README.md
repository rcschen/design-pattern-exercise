# reference
- [良葛格](http://openhome.cc/Gossip/DesignPattern/BridgePattern.htm)

# class diagram
![jpg](https://github.com/rcschen/design-pattern-exercise/blob/master/bridge_turtle/Bridge-4.jpg)

# notes
- different from strategy [(ref)](http://howard-lyrics.blogspot.tw/2011/04/design-pattern-bridge.html)
```
bridge vesus strategy

雖然bridge和strategy的UML圖看起來一樣，但兩者有著本質上的不同。

bridge pattern是用來設計編譯時期的結構，
strategy是用來設計執行時期的行為。

以此例來說，使用何種版本的android platform，是在編譯時期就決定好的，
不會在執行的時候才決定要用froyo或gingerbread，
因此套用在這個例子上的模式是bridge pattern。
```
