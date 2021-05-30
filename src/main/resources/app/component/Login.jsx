import React, {Component} from 'react'

function Field ({name, value,onChange,children}) {
        return (
            <div>
                <label htmlFor={name}> {children} </label>
                <input type="text" value={value} onChange={onChange} id={name} name={name} className="form-control"/>
            </div>

        )
}

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
        event.preventDefault()
        const data = JSON.stringify(this.state);
        console.log(data)
    }


    render() {
        return (
            <form onSubmit={this.handleSubmit} method="post" className="container">

            <Field name="username" value={this.state.username} onChange={this.handleChange}> Username :</Field>
            <Field name="password" value={this.state.password} onChange={this.handleChange}> Password :</Field>

            <div className="form-group">
                <button className="btn btn-primary" onSubmit={this.handleSubmit}> Connect </button>
            </div>
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
