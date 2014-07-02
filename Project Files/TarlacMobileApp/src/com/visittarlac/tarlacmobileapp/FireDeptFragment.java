package com.visittarlac.tarlacmobileapp;

import com.visittarlac.tarlacmobileapp.R;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.app.Activity;

 
public class FireDeptFragment extends Fragment {
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
    	View View = inflater.inflate(R.layout.fragment_firedept, container, false);

        
        Button Call1 = (Button) View.findViewById(R.id.callAmosMbl);
	      Call1.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall1();
	      }
	   });
        
	    Button Call2 = (Button) View.findViewById(R.id.callBambanMbl);
	      Call2.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall2();
	      }
	   });
	      
	    
	     Button Call3 = (Button) View.findViewById(R.id.callCamilingTel);
	      Call3.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall3();
	      }
	   });
	      
	      Button Call4 = (Button) View.findViewById(R.id.callCamilingMbl);
	      Call4.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall4();
	      }
	   });
	      
	      Button Call5 = (Button) View.findViewById(R.id.callCapasTel);
	      Call5.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall5();
	      }
	   });
	   
	      
	      Button Call6 = (Button) View.findViewById(R.id.callCapasMbl);
	      Call6.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall6();
	      }
	   });
	   
	      
	      Button Call7 = (Button) View.findViewById(R.id.callCapasSubMbl);
	      Call7.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall7();
	      }
	   });
	   
	      
	      Button Call8 = (Button) View.findViewById(R.id.callGeronaTel);
	      Call8.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall8();
	      }
	   });
	   
	      
	      Button Call9 = (Button) View.findViewById(R.id.callGeronaMbl);
	      Call9.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall9();
	      }
	   });
	   
	      
	      Button Call10= (Button) View.findViewById(R.id.callLaPazTel);
	      Call10.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall10();
	      }
	   });
	      
	      Button Call11= (Button) View.findViewById(R.id.callLaPazMbl);
	      Call11.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall11();
	      }
	   });
	      
	      Button Call12= (Button) View.findViewById(R.id.callMayantocTel);
	      Call12.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall12();
	      }
	   });
	      
	      Button Call13= (Button) View.findViewById(R.id.callMayantocMbl);
	      Call13.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall13();
	      }
	   });
	      
	      Button Call14= (Button) View.findViewById(R.id.callMoncadaTel);
	      Call14.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall14();
	      }
	   });
	      
	      Button Call15= (Button) View.findViewById(R.id.callMoncadaMbl);
	      Call15.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall15();
	      }
	   });
	      
	      
	      Button Call16= (Button) View.findViewById(R.id.callPaniquiTel);
	      Call16.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall16();
	      }
	   });
	   
	      
	      Button Call17= (Button) View.findViewById(R.id.callPaniquiMbl);
	      Call17.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall17();
	      }
	   });
	   
	      
	      Button Call18= (Button) View.findViewById(R.id.callSanJoseMbl);
	      Call18.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall18();
	      }
	   });
	   
	      
	      Button Call19= (Button) View.findViewById(R.id.callStaIgnaciaTel);
	      Call19.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall19();
	      }
	   });
	   
	      
	      Button Call20= (Button) View.findViewById(R.id.callStaIgnaciaMbl);
	      Call20.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall20();
	      }
	   });
	   
	      
	      Button Call21= (Button) View.findViewById(R.id.callTarlacTel);
	      Call21.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall21();
	      }
	   });
	   
	      
	      Button Call22= (Button) View.findViewById(R.id.callTarlac1Tel);
	      Call22.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall22();
	      }
	   });
	   
	      
	      Button Call23= (Button) View.findViewById(R.id.callTarlacMbl);
	      Call23.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall23();
	      }
	   });
	   
	      
	      Button Call24= (Button) View.findViewById(R.id.callVictoriaTel);
	      Call24.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall24();
	      }
	   });
	   
	      
	      Button Call25= (Button) View.findViewById(R.id.callVictoriaMbl);
	      Call25.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View view) {
	         makeCall25();
	      }
	   });
	   
	   
	    
	    return View;
        
	      
    }
 

	   protected void makeCall1() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:0910-891-0964"));                         
           startActivity(callIntent);
		  
	   }
	   
	   protected void makeCall2() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:0921-540-4809"));                         
           startActivity(callIntent);
		  
	   }
	   
	   protected void makeCall3() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:934-0959"));                         
           startActivity(callIntent);
		  
	   }
	   
	   protected void makeCall4() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:0908-127-4114"));                         
           startActivity(callIntent);
		  
	   }
	   
	   protected void makeCall5() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:925-0398"));                         
           startActivity(callIntent);
		  
	   }
	   
	   protected void makeCall6() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:0908-395-3790"));                         
           startActivity(callIntent);
		  
	   }
	   
	   protected void makeCall7() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:0929-469-3648"));                         
           startActivity(callIntent);
		  
	   }
	   
	   protected void makeCall8() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:608-0140"));                         
           startActivity(callIntent);
		  
	   }
	   
	   protected void makeCall9() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:0921-477-2362"));                         
           startActivity(callIntent);
		  
	   }
	   
	   protected void makeCall10() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:611-0600"));                         
           startActivity(callIntent);
		  
	   }
	   
	   protected void makeCall11() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:0929-469-3648"));                         
           startActivity(callIntent);
		  
	   }
	   
	   protected void makeCall12() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:491-5010"));                         
           startActivity(callIntent);
		  
	   }
	   
	   protected void makeCall13() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:0919-468-6542"));                         
           startActivity(callIntent);
		  
	   }
	   
	   protected void makeCall14() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:601-0432"));                         
           startActivity(callIntent);
		  
	   }
	   
	   protected void makeCall15() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:0906-219-7243"));                         
           startActivity(callIntent);
		  
	   }
	   
	   protected void makeCall16() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:931-1110"));                         
           startActivity(callIntent);
		  
	   }
	   
	   protected void makeCall17() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:0907-379-6606"));                         
           startActivity(callIntent);
		  
	   }
	   
	   protected void makeCall18() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:0921-239-3617"));                         
           startActivity(callIntent);
		  
	   }
	   
	   protected void makeCall19() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:605-0205"));                         
           startActivity(callIntent);
		  
	   }
	   
	   protected void makeCall20() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:0907-480-2692"));                         
           startActivity(callIntent);
		  
	   }
	   
	   protected void makeCall21() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:982-1356"));                         
           startActivity(callIntent);
		  
	   }
	   
	   protected void makeCall22() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:982-1159"));                         
           startActivity(callIntent);
		  
	   }
	   
	   protected void makeCall23() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:0919-580-7558"));                         
           startActivity(callIntent);
		  
	   }
	   
	   protected void makeCall24() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:930-0166"));                         
           startActivity(callIntent);
		  
	   }
	   
	   protected void makeCall25() {

		   Intent callIntent = new Intent(Intent.ACTION_CALL); 
           callIntent.setData(Uri.parse("tel:0917-514-4311"));                         
           startActivity(callIntent);
		  
	   }
	   
	   
	   
}



