#include <iostream>
#include <cmath>
#include <TGraph.h>
#include <TCanvas.h>

double k1  = 2.;
double k12 = 2.;
double k2  = 2.;
double m1  = 0.2;
double m2  = 0.2;

//dx/dt=v
double velocity_1(double v1){
  return v1;
}

double velocity_2(double v2){
  return v2;
}

//dv/dt=-kx/m
double accelera_1(double x1, double x2){
  return -(k1+k12)/m1*x1+(k12/m1)*x2;
}

double accelera_2(double x1, double x2){
  return -(k2+k12)/m2*x2+(k12/m2)*x1;
}

void RK4(double *x1, double *v1, double *x2, double *v2, double dt){

  double dv11, dv12, dv13, dv14;
  double dv21, dv22, dv23, dv24;
  double dx11, dx12, dx13, dx14;
  double dx21, dx22, dx23, dx24;
  
  dx11 = dt*velocity_1(*v1);
  dv11 = dt*accelera_1(*x1, *x2);

  dx21 = dt*velocity_2(*v2);
  dv21 = dt*accelera_2(*x1, *x2);
  
  dx12 = dt*velocity_1(*v1+0.5*dv11);
  dv12 = dt*accelera_1(*x1+0.5*dx11, *x2+0.5*dx21);

  dx22 = dt*velocity_2(*v2+0.5*dv21);
  dv22 = dt*accelera_2(*x1+0.5*dx11, *x2+0.5*dx21);
  
  dx13 = dt*velocity_1(*v1+0.5*dv12);
  dv13 = dt*accelera_1(*x1+0.5*dx12, *x2+0.5*dx22);

  dx23 = dt*velocity_2(*v2+0.5*dv22);
  dv23 = dt*accelera_2(*x1+0.5*dx12, *x2+0.5*dx22);
    
  dx14 = dt*velocity_1(*v1+dv13);
  dv14 = dt*accelera_1(*x1+dx13, *x2+dx23);

  dx24 = dt*velocity_2(*v2+dv23);
  dv24 = dt*accelera_2(*x1+dx13, *x2+dx23);
  
  *v1 += (dv11+(2*dv12)+(2*dv13)+dv14)/6.0;
  *x1 += (dx11+(2*dx12)+(2*dx13)+dx14)/6.0;

  *v2 += (dv21+(2*dv22)+(2*dv23)+dv24)/6.0;
  *x2 += (dx21+(2*dx22)+(2*dx23)+dx24)/6.0;

}

void rungeKutta(){ 

  double xmin = 0;
  double xmax = 50;
  double dt = 0.05;
  
  int iteration = (xmax-xmin)/dt;
 
  double x1 = 1;
  double v1 = 0;

  double x2 = 0;
  double v2 = 0;

  double X1[iteration];
  double V1[iteration];
  
  double X2[iteration];
  double V2[iteration];
  
  for( int n = 0; n <= iteration; n++ ){

    X1[n] = x1;
    V1[n] = v1;
        
    X2[n] = x2;
    V2[n] = v2;
    
    RK4(&x1,&v1,&x2,&v2,dt);

  }

  TCanvas* c = new TCanvas("c", "", 0, 0, 1000, 800);
  c->cd();
  
  TGraph* g  = new TGraph(iteration, X1, V1);
  g->Draw("AC");

  c->Print("tes.pdf");
}

