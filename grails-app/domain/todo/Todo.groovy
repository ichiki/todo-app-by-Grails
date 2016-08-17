package todo

class Todo {

  static constraints = {
    title()
    description(maxSize:1000)
    dateCreated()
    lastUpdated()
  }

  String title
  String description
  Date dateCreated
  Date lastUpdated
}
