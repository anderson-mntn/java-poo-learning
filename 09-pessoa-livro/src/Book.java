 class Book implements Publication {
    private String title;
    private String author;
    private int totalPages;
    private int currentPage;
    private boolean open;
    private Person owner;
    
    // to String
    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", totalPages=" + totalPages +", current page=" + currentPage+ ", open=" + open
                + ", owner=" + owner.getName() + "]";
    }
    
    //Constructors

    public Book(String title, String author, int totalPages, Person owner) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.open = false;
        this.owner = owner;
        this.currentPage = 0;
    }

    public String getTitle() {
        return title;
    }

    //Getters And Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }


    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void details(){
        
    }

    @Override
    public void browseToPage(int page) {
        if(this.open == true){
            this.currentPage = page;
            System.out.println("Browsing to page: " + page);    
        } else {
            System.out.println("the book is close, please open it.");
        }
    }

    @Override
    public void close() {
        if(this.open == true){
            System.out.println("Closing the book...");    
        } else {
            System.out.println("the book is already close.");
        }
        
    }

    @Override
    public void nextPage() {
        if(this.open == true){
            this.currentPage++;
            System.out.println("Browsing to the next page: " + getCurrentPage());
                
        } else {
            System.out.println("the book is close, please open it.");
        }
        
    }

    @Override
    public void open() {
        this.open = true;
        System.out.println("The book is now open!");
        
    }

    @Override
    public void previousPage() {
        if(this.open == true){
            this.currentPage--;
            System.out.println("Browsing to the previous page: " + currentPage);    
        } else {
            System.out.println("the book is close, please open it.");
        }
    }
    
}
