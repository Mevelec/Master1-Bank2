import React from "react";
import * as ReactBootstrap from 'react-bootstrap';

function NavBar(){
    return (
        <ReactBootstrap.Navbar bg="light" expand="lg">
            <ReactBootstrap.Navbar.Brand href="#home">Bank</ReactBootstrap.Navbar.Brand>
            <ReactBootstrap.Navbar.Toggle aria-controls="basic-navbar-nav" />
            <ReactBootstrap.Navbar.Collapse id="basic-navbar-nav">
                <ReactBootstrap.Nav className="mr-auto">
                <ReactBootstrap.Nav.Link href="#home">Home</ReactBootstrap.Nav.Link>
                <ReactBootstrap.NavDropdown title="Dropdown" id="basic-nav-dropdown">
                    <ReactBootstrap.NavDropdown.Item href="#action/3.1">Action</ReactBootstrap.NavDropdown.Item>
                    <ReactBootstrap.NavDropdown.Item href="#action/3.2">Another action</ReactBootstrap.NavDropdown.Item>
                    <ReactBootstrap.NavDropdown.Item href="#action/3.3">Something</ReactBootstrap.NavDropdown.Item>
                    <ReactBootstrap.NavDropdown.Divider />
                    <ReactBootstrap.NavDropdown.Item href="#action/3.4">Separated link</ReactBootstrap.NavDropdown.Item>
                </ReactBootstrap.NavDropdown>
                </ReactBootstrap.Nav>
            </ReactBootstrap.Navbar.Collapse>
        </ReactBootstrap.Navbar>


        
    );
}
export default NavBar;
