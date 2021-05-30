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
            bankAccounts:[]
        };
    }

    componentDidMount() {
        fetch("/api/BankAccount/list")
            .then(response=>response.json)
            .then(bankAccounts => this.setState(bankAccounts))
    }


    render(){

        const {bankAccounts} = this.state; // récupère les comptes en banque de l'utilisateur

        return (

            <Fragment>

                <table>
                    <tr>
                        <th> Account name </th>
                        <th> Value :  </th>
                        <th> See transaction </th>
                    </tr>

                {

                    bankAccounts.map(({name,value, id}) => {
                        return (

                            <tr>
                                <th> {name}</th>
                                <th>  {value} </th>
                                <th>  <button value={id}> see transaction </button></th>
                            </tr>
                        )
                    } )
                }

                </table>

            </Fragment>

        )
    }
}
