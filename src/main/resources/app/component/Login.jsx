import React, {Component, Fragment} from 'react'

export default class Login extends Component {

    constructor(props) {
        super(props);
        this.state = {valueLogin: '', valuePassword: ''};

        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleChange(event) {
        this.setState({valueLogin: event.target.valueLogin});
        this.setState({valuePassword: event.target.valuePassword})
    }


    render() {
        return (
            <form >
                <label>
                    Login :
                    <input type="text" value={this.state.valueLogin} onChange={this.handleChange} />
                </label>

                <label>
                    Password :
                    <input type="text" value={this.state.valuePassword} onChange={this.handleChange} />
                </label>

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
