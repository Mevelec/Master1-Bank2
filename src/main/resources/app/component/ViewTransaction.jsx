import React, {Component, Fragment} from 'react';
import {map} from "react-bootstrap/ElementChildren";

/**
 * Used to see the transaction of an account
 */
export default class ViewTransaction extends Component {

    constructor(props) {
        super(props);
        this.id = 1;
        this.state = {
            id:1,
            transactions:[]
        };
    }

    componentDidMount() {
        fetch("/api/Operation/list")
            .then(response=>response.json())
            .then(transactions => {
                console.log(transactions)
                this.setState(transactions)
            })

    }


    render(){

        const {transactions} = this.state;

        return (

            <Fragment>
                <table>
                    <tr>
                        <th> Operation name </th>
                        <th> Amount :  </th>
                        <th> date </th>
                    </tr>

                {

                    transactions.map(({name,amount, date}) => {
                        return (

                            <tr>
                                <th> {name}</th>
                                <th>  {amount} </th>
                                <th> {date}</th>
                            </tr>
                        )
                    } )
                }

                </table>
            </Fragment>

        )
    }
}
