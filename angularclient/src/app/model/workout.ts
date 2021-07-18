export class Workout {
    name: string;
    id: string;
    date: string;
    body: string;

    constructor(id?, name?, date?, body?) {
        this.id = id;
        this.name = name;
        this.date = date;
        if(body) {
                this.body = body.replace(/(?:\r\n|\r|\n)/g, '<br>');
        }

        console.log(this.body)
      }
}
