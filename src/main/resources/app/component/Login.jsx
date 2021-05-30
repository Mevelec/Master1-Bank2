import React, {Component} from 'react'

export default class Login extends Component {

    constructor(props) {
        super(props);
        this.state = {
            username: '',
            password: ''
        };

        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleChange(event) {

        const name = event.target.name;

        this.setState({
            [name]: event.target.value
        });

    }

    handleSubmit(event){

    }


    render() {
        return (
            <form target="/api/user/login" method="post">
                <label htmlFor="username"> username : </label>
                <input type="text" id="username" name="username" value={this.state.username} onChange={this.handleChange} />

                <label htmlFor="password"> Password : </label>
                <input type="text" id="password" name="password" value={this.state.password} onChange={this.handleChange} />


                <input type="submit" value="Envoyer" />
            </form>
        );
    }



}

/*
const inputs = [{
  name: "username",
  placeholder: "username",
  type: "text"
},{
  name: "password",
  placeholder: "password",
  type: "password"
},{
  type: "submit",
  value: "Submit",
  className: "btn"
}]

const props = {
  name: 'loginForm',
  method: 'POST',
  action: '/api/user/login',
  inputs: inputs
}

const params = new URLSearchParams(window.location.search)

ReactDOM.render(
  <Form {...props} error={params.get('error')} />,
  document.getElementById('main'))
 */
