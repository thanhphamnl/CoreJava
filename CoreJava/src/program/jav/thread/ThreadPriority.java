package program.jav.thread;

public class ThreadPriority extends Thread{  
	 
	public void run(){  
	   System.out.println("running thread name is:"+Thread.currentThread().getName());  
	   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  	  
	  }  
	
	 public static void main(String args[]){  
	  
	  ThreadPriority m1=new ThreadPriority();  
	  ThreadPriority m2=new ThreadPriority();  
	  m1.setName("Abc");
	  m2.setName("XYZ");
	 
	  m1.setPriority(Thread.MIN_PRIORITY);  
	  m2.setPriority(Thread.NORM_PRIORITY);  
	  
	  m1.start();  
	  m2.start();  
	   
	 }  
	}     
