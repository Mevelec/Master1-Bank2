import React, {Component, Fragment} from 'react';

class ConnectForm extends Component {
    render(){
        return(
            <Fragment>


                <form action="/connect" method="post">
                    <label> login : </label>
                    <input type="text"  />

                    <label> password : </label>
                    <input type="password"  />

                    <input type="submit" value={"Connect"}/>

                </form>

            </Fragment>
        )
    }
}
export default ConnectForm