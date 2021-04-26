package BookArray;

public class Book {
	
	//start main method
	
		public static void main(String[]args)
		
		{
			
			//create an array to store 10 books
			
			Book books [] = new Book[10];
			
			//create and store 5 Fiction objects
			
			books[0] = new Fiction("Ayesha of the Bosphorus: A Romance of Constantinople");
			
			books[1] = new Fiction("1/2");
			
			books[2] = new Fiction("Birth and Call of Jesus Christ: A Bahá'í-inspired retelling");
			
			books[3] = new Fiction("Breathe Not the Sins of Others: A Tale of Suspense");
			
			books[4] = new Fiction("Inception");
			
			books[5] = new NonFiction("In Cold Blood");
			
			books[6] = new NonFiction("oming Out");
			
			books[7] = new NonFiction("Room");
			
			books[8] = new NonFiction("A Room of One's Own");
			
			books[9] = new NonFiction("Dramatic Readings");
			
			  //display the details of all books
			
			System.out.println("Details of all tha books:");
			
			for (int i = 0; i < books.length; i++)
				
			{
				
				System.out.println();
				
				System.out.println((i+1)+ "Name:"+ books[i].getBookTitle());
				
				System.out.println("Price: $" + books[i].getBookPrice());
			
			}//end for
			
		}//end of main method
		
	//end of BookArray class class Book{
		
		private String bookTitle;
		private double bookPrice;
		
		public Book(String title) {
			this.bookTitle = title;
				bookPrice = 43.54;
				
			}
		
		public String getBookTitle() {
			return bookTitle;
		}
			
			public double getBookPrice() {
				return bookPrice;
				
			}
		}
		
		class Fiction extends Book{
			public Fiction(String title) {
				super(title);
				
			}
			
		}
		
		class NonFiction extends Book{
			public NonFiction(String title) {
				super(title);
				
			}
			
		}

