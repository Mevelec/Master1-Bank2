import React, {Component, Fragment} from 'react';
import {map} from "react-bootstrap/ElementChildren";

/**
 * Used to see the bank account of the user
 */
export default class ViewAccount extends Component {

    constructor(props) {
        super(props);
        this.id = 1;
        this.state = {
            id:1,
            lignes:[]
        };
    }

    componentDidMount() {
        fetch("/api/BankAccount/list")
        .then(response=>response.json())
        .then(lignes => {
            console.log(lignes);
            this.setState({lignes})
        })
    }


    render(){

        const {lignes} = this.state; // récupère les comptes en banque de l'utilisateur

        return (

            <Fragment>

                <table>
                    <thead>
                        <tr>
                            <th> Account name </th>
                            <th> Value :  </th>
                            <th> See transaction </th>
                        </tr>
                    </thead>
                    <tbody>

                    {

                        lignes.map(({id,user}) => {
                            return (

                                <tr>
                                    <th> {id}</th>
                                    <th>  {user.username} </th>
                                    <th>  <button value={id}> see transaction </button></th>
                                </tr>
                            )
                        } )
                    }

                    </tbody>

                </table>

            </Fragment>

        )
    }
}
