package com.example.desafiomobileandroid.menu.repository

import com.example.desafiomobileandroid.R
import com.example.desafiomobileandroid.menu.model.MenuOptionModel

class MenuOptionRepository {
    var menuOption = mutableListOf<MenuOptionModel>(
        MenuOptionModel(
            id = 1,
            name = "Salada com molho Gengibre",
            details = "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
            image = R.drawable.salada_molho_gengibre),
        MenuOptionModel(
            id = 2,
            name = "Salada com molho Gengibre",
            details = "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
            image = R.drawable.salada_molho_gengibre),
        MenuOptionModel(
            id = 3,
            name = "Salada com molho Gengibre",
            details = "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
            image = R.drawable.salada_molho_gengibre),
        MenuOptionModel(
            id = 4,
            name = "Salada com molho Gengibre",
            details = "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
            image = R.drawable.salada_molho_gengibre),
        MenuOptionModel(
            id = 5,
            name = "Salada com molho Gengibre",
            details = "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
            image = R.drawable.salada_molho_gengibre),
        MenuOptionModel(
            id = 6,
            name = "Salada com molho Gengibre",
            details = "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
            image = R.drawable.salada_molho_gengibre),
        MenuOptionModel(
            id = 7,
            name = "Salada com molho Gengibre",
            details = "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
            image = R.drawable.salada_molho_gengibre),
        MenuOptionModel(
            id = 8,
            name = "Salada com molho Gengibre",
            details = "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
            image = R.drawable.salada_molho_gengibre),
        MenuOptionModel(
            id = 9,
            name = "Salada com molho Gengibre",
            details = "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
            image = R.drawable.salada_molho_gengibre),
        MenuOptionModel(
            id = 10,
            name = "Salada com molho Gengibre",
            details = "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
            image = R.drawable.salada_molho_gengibre))

    fun getList(callback: (menuOption: List<MenuOptionModel>) -> Unit) {
        callback.invoke(getMenuOptionList())
    }

    fun getMenuOptionList(): MutableList<MenuOptionModel> {
        return menuOption
    }
}