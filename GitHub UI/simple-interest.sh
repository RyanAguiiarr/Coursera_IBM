#!/bin/bash
# Este script calcula juros simples dado o principal, taxa de juros anual e período de tempo em anos.

# Não use isso em produção. Apenas para fins de exemplo.

# Autor: Upkar Lidder (IBM)
# Autores Adicionais:
# <seu nome de usuário>

# Entrada:
# p, montante principal
# t, período de tempo em anos
# r, taxa de juros anual

# Saída:
# juros simples = p*t*r

echo "Entre com o principal:"
read p
echo "Entre com a taxa de juros por ano:"
read r
echo "Entre com o período de tempo em anos:"
read t

s=`expr $p \* $t \* $r / 100`
echo "O juro simples é: "
echo $s