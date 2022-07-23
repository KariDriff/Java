package br.com.DesafioDeProjeto;

import java.util.List;

public class Banco {
 private String name;
 private List<Cliente> contas;
 
 public String getNome() {
  return name;
 }
 
 public void setNome(String nome) {
  this.name = nome;
 }
 
 public List<Cliente> getContas() {
  return contas;
 }
 
 public void setContas(List<Cliente> contas) {
  this.contas = contas;
 }
}
