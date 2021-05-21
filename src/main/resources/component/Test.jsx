import React, {Component, Fragment} from 'react';

class Test extends Component {
    render(){

        {/* le fragment permet de retourner plusieurs éléments en même temps, sans apparaitre dans le code généré */ }

        return (

            <Fragment>
                <h1> Titre</h1>
                <input/>
            </Fragment>

        )
    }
}
export default Test