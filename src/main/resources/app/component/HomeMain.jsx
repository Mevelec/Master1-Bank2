import React, { Component, Fragment } from 'react'
import { BrowserRouter as Router } from 'react-router-dom'

export default class HomeMain extends Component {

    constructor(props) {
        super(props);
        this.state = {};
    }



    render() {
            return (
                <Fragment>
                    <h1> Welcome on the website bank. </h1>


                    <button type="button" onClick={fetch("/login")}>
                        Cancel
                    </button>



                </Fragment>
            )
    }
}
