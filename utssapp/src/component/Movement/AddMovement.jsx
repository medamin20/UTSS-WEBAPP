import { FormGroup } from '@material-ui/core';
import React, { Component, useState } from 'react';
import MovementServices from '../../services/MovementServices';
import { Container } from '@material-ui/core';
import { v4 as uuidv4 } from 'uuid';
import './addmovement.css';
class AddMovement extends Component {
  constructor(props) {
    super(props);
    this.state = {
      movType: '',
      orderDate: '',
      newarticle: {
        id: uuidv4(),
        titleProduct: '',
        desciptionProduct: '',
        priceProduct: '',
        quantityProduct: '',
      },
      movProducts: [
        {
          id: uuidv4(),
          titleProduct: '',
          desciptionProduct: '',
          priceProduct: '',
          quantityProduct: '',
        },
      ],
    };
    this.changeOrderDateHandler = this.changeOrderDateHandler.bind(this);
    this.changeMovTypeHandler = this.changeMovTypeHandler.bind(this);
    this.saveMovement = this.saveMovement.bind(this);
    this.cancel = this.cancel?.bind(this);
    this.handleChages = this.handleChages.bind(this);
    this.addProduct = this.addProduct.bind(this);
    this.handledelete = this.handledelete.bind(this);
    //Price +Quantity +product
    this.handleChangeTP = this.handleChangeTP?.bind(this);
    this.handleChangePP = this.handleChangePP?.bind(this);
    this.handleChangeQP = this.handleChangeQP?.bind(this);
  }

  changeMovTypeHandler = (event) => {
    this.setState({ movType: event.target.value });
  };
  changeOrderDateHandler = (event) => {
    this.setState({ orderDate: event.target.value });
  };

  saveMovement = (m) => {
    m.preventDefault();
    let movement = {
      movType: this.state.movType,
      orderDate: this.state.orderDate,
      movProducts: this.state.movProducts,
    };
    MovementServices.addMovement(movement).then((res) => {
      this.props.history.push('/all-Movements');
    });
  };

  addProduct(e) {
    e.preventDefault();

    this.setState({
      movProducts: [
        ...this.state.movProducts,
        {
          id: uuidv4(),
          titleProduct: '',
          desciptionProduct: '',
          priceProduct: '',
          quantityProduct: '',
        },
      ],
    });
  }

  handleChages(id, event) {
    const newInputFields = this.state.movProducts.map((i) => {
      if (id === i.id) {
        i[event.target.name] = event.target.value;
      }
      return i;
    });

    this.setState({ movProducts: newInputFields });
  }

  handledelete(e, id) {
    e.preventDefault();
    let moveProducts = this.state.movProducts;
    moveProducts.splice(
      moveProducts.findIndex((value) => value.id === id),
      1
    );
    this.setState({ movProducts: moveProducts });
  }

  cancel() {
    this.props.history.push('/all-Movements');
  }

  //Quantity ,+ price + product
  handleChangeTP = (e) => {
    let tp = this.state.movProducts;
    tp[0].titleProduct = e.target.value;
    this.setState({ titleProduct: tp });
  };
  handleChangePP = (e) => {
    this.setState({ priceProduct: e.target.value });
  };

  chandleChangeQP = (e) => {
    this.setState({ quantityProduct: e.target.value });
  };

  render() {
    return (
      <div className="addmov">
        <h1>Ajouter Mouvement</h1>
        <Container>
          <form action="">
            <div className="form_group">
              <label> Type de mouvement</label>
              <div className="box">
                <select
                  value={this.state.movType}
                  onChange={(e) => this.changeMovTypeHandler(e)}
                >
                  <option value="SUPPLYRECEPTION">SUPPLY RECEPTION</option>
                  <option value="CORRECTIONPOSITIVE">
                    CORRECTION POSITIVE
                  </option>
                  <option value="CORRECTIONNEGATIVE">
                    CORRECTION NEGATIVE
                  </option>
                  <option value="TOSOTRE">TO SOTRE</option>
                  <option value="DESTRUCTION">DESTRUCTION</option>
                </select>
              </div>
            </div>
            <div className="form_group">
              <label> Date Movement</label>
              <input
                type="date"
                name="Movement Date"
                className="form-control"
                value={this.state.orderDate}
                onChange={(e) => this.changeOrderDateHandler(e)}
              />
            </div>

            <label> Products</label>

            {this.state.movProducts.map((prod, index) => {
              return (
                <div key={index}>
                  <input
                    value={prod.titleProduct}
                    placeholder="titleProduct"
                    name="titleProduct"
                    onChange={(event) => this.handleChages(prod.id, event)}
                  />
                  <input
                    value={prod.priceProduct}
                    placeholder="priceProduct"
                    name="priceProduct"
                    onChange={(event) => this.handleChages(prod.id, event)}
                  />
                  <input
                    value={prod.quantityProduct}
                    placeholder="quantityProduct"
                    name="quantityProduct"
                    onChange={(event) => this.handleChages(prod.id, event)}
                  />

                  <button className="btn btn-secondary" onClick={(e) => this.handledelete(e, prod.id)}>
                    Supprimer produit
                  </button>
                </div>
              );
            })}
          

            <span></span>

<p>

    <br></br>
</p>

          <div className="page-content page-container">
          <div class="padding">
          <div class="row container d-flex justify-content-center">
          <div class="col-sm-6">
              <button className="btn btn-success" onClick={this.saveMovement}>
                enregistrer
              </button>
                    
              <button className="btn btn-danger" onClick={this.cancel}>
                annuler
              </button>

              <button className="btn btn-warning" onClick={this.addProduct}>
                ajouter produit
              </button>
              </div>
            </div>
            </div>
            </div>
          </form>
        </Container>
      </div>
    );
  }
}

export default AddMovement;