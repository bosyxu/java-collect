
class A;
class B{

public: 
    B(){}
    ~B(){}

    void display(A& a);

};



class A{
public:
    A():i(1){}
    ~A(){}

friend void B::display(A& a);
public:

    void display();

private:
    int i;


};

