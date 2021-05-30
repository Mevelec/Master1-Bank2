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
      event.preventDefault();

      const requestOptions = {
        method: 'POST',
        headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
        body: Object.keys(this.state).map(key => encodeURIComponent(key) + '=' + encodeURIComponent(this.state[key])).join('&')
      };
      fetch('/api/user/login', requestOptions).then(function(response) {
        if(response.ok) {
          window.location.href = "/ViewAccount";
        }
        throw new Error('Network response was not ok.');
      });
    }


    render() {
        return (
            <form onSubmit={this.handleSubmit}>

                <label htmlFor="username"> Username: </label>
                <input type="text" name="username"  id="username" value={this.state.username} onChange={this.handleChange} className="form-control"/>

                <label htmlFor="password"> Password:  </label>
                <input type="password"  name="password" id="password" value={this.state.password} onChange={this.handleChange} className="form-control"/>

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
