public List<Book> findBooks(String title, String author, LocalDate firstDate, LocalDate endDate) {
  List<Book> foundBooks = new ArrayList<>();

  if (!validateInput(title, author)) {
    return foundBooks;
  }

  for (Book book : books) {
    if (isWithinDateRange(book, firstDate, endDate) &&
        isMatchingTitleAndAuthor(book, title, author)) {
      foundBooks.add(book);
    }
  }
  return foundBooks;
}

private boolean validateInput(String title, String author) {
  return !title.isEmpty() && !author.isEmpty() &&
      !title.contains("\\n") && !author.contains("\\n");
}

private boolean isWithinDateRange(Book book, LocalDate firstDate, LocalDate endDate) {
  return book.getPublishedOn().isAfter(firstDate) && book.getPublishedOn().isBefore(endDate);
}

private boolean isMatchingTitleAndAuthor(Book book, String title, String author) {
  return book.getTitle().contentEquals(title) && book.getAuthor().contentEquals(author);
}


/* smell are : 1. complicated if else
2. duplicate code
3. long method */
