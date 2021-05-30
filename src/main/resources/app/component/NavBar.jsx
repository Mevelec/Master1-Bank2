import React from "react";
import * as ReactBootstrap from 'react-bootstrap';

function NavBar(){
    return (
        <ReactBootstrap.Navbar bg="light" expand="lg">
            <ReactBootstrap.Navbar.Brand href="/">Home</ReactBootstrap.Navbar.Brand>
            <ReactBootstrap.Navbar.Toggle aria-controls="basic-navbar-nav" />
            <ReactBootstrap.Navbar.Collapse id="basic-navbar-nav">
                <ReactBootstrap.Nav className="mr-auto">
                <ReactBootstrap.Nav.Link href="/login">log in</ReactBootstrap.Nav.Link>
                </ReactBootstrap.Nav>
            </ReactBootstrap.Navbar.Collapse>
        </ReactBootstrap.Navbar>
    );
}
export default NavBar;
