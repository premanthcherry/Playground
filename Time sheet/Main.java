#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int s,m,t,w,th,f,sa;
  int b,br,r1,r2,r3,r4,r5,r6,r7,r8=0;
  int ed,td,tr;
  cin>>s>>m>>t>>w>>th>>f>>sa;
  r1=s*150;
  r7=sa*125;
  if(m<=8)
  {
    r2=m*100;
  }
  else if(m>8)
  {
    b=m-8;
    br=b*115;
    r2=br+800;
  }
  if(t<=8)
  {
    r3=t*100;
  }
  else if(t>8)
  {
    b=t-8;
    br=b*115;
    r3=br+800;
  }
  if(w<=8)
  {
    r4=w*100;
  }
  else if(w>8)
  {
    b=w-8;
    br=b*115;
    r4=br+800;
  }
  if(th<=8)
  {
    r5=th*100;
  }
  else if(th>8)
  {
    b=th-8;
    br=b*115;
    r5=br+800;
  }
  if(f<=8)
  {
    r6=f*100;
  }
  else if(f>8)
  {
    b=f-8;
    br=b*115;
    r6=br+800;
  }
  td=m+t+w+th+f;
  if(td>40)
  {
    ed=td-40;
    r8=ed*25;
  }
  tr=r1+r2+r3+r4+r5+r6+r7+r8;
  cout<<tr;
  return 0;
}